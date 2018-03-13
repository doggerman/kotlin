/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.script.experimental.jvm.runners

import kotlin.reflect.KClass
import kotlin.script.experimental.api.*

open class BasicJvmScriptRunner<ScriptBase : Any>(val baseClass: KClass<ScriptBase>? = null) : ScriptRunner<ScriptBase> {

    override suspend fun run(
        compiledScript: CompiledScript<ScriptBase>,
        scriptEvaluationEnvironment: ScriptEvaluationEnvironment
    ): ResultWithDiagnostics<EvaluationResult> =
        try {
            val obj = compiledScript.instantiate(scriptEvaluationEnvironment)
            when (obj) {
                is ResultWithDiagnostics.Failure -> obj.convert()
                is ResultWithDiagnostics.Success -> {
                    // in the future, when (if) we'll stop to compile everything into constructor
                    // run as SAM
                    // return res
                    val scriptObject = obj.value
                    if (scriptObject !is Class<*>)
                        ResultWithDiagnostics.Failure(ScriptDiagnostic("expecting class in this implementation, got ${scriptObject?.javaClass}"))
                    else {
                        val receivers = scriptEvaluationEnvironment.getOrNull(ScriptEvaluationEnvironmentParams.implicitReceivers)
                        if (receivers == null) {
                            scriptObject.getConstructor().newInstance()
                        } else {
                            scriptObject.getConstructor(Array<Any>::class.java).newInstance(receivers.toTypedArray())
                        }

                        ResultWithDiagnostics.Success(EvaluationResult(null, scriptEvaluationEnvironment))
                    }
                }
            }
        } catch (e: Exception) {
            ResultWithDiagnostics.Failure(ScriptDiagnostic(e.message ?: "$e"))
        }
}
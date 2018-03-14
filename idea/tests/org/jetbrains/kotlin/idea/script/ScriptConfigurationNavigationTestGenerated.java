/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.script;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/script/definition/navigation")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ScriptConfigurationNavigationTestGenerated extends AbstractScriptConfigurationNavigationTest {
    public void testAllFilesPresentInNavigation() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/script/definition/navigation"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("conflictingModule")
    public void testConflictingModule() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/navigation/conflictingModule/");
        doTest(fileName);
    }

    @TestMetadata("customBaseClass")
    public void testCustomBaseClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/navigation/customBaseClass/");
        doTest(fileName);
    }

    @TestMetadata("javaLib")
    public void testJavaLib() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/navigation/javaLib/");
        doTest(fileName);
    }

    @TestMetadata("javaLibWithSources")
    public void testJavaLibWithSources() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/navigation/javaLibWithSources/");
        doTest(fileName);
    }

    @TestMetadata("kotlinLib")
    public void testKotlinLib() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/navigation/kotlinLib/");
        doTest(fileName);
    }

    @TestMetadata("kotlinLibWithSources")
    public void testKotlinLibWithSources() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/navigation/kotlinLibWithSources/");
        doTest(fileName);
    }

    @TestMetadata("stdlib")
    public void testStdlib() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/navigation/stdlib/");
        doTest(fileName);
    }

    @TestMetadata("stdlibWithSources")
    public void testStdlibWithSources() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/navigation/stdlibWithSources/");
        doTest(fileName);
    }
}

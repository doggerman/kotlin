/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.compiler.javac;

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
@RunWith(JUnit3RunnerWithInners.class)
public class LoadJava8UsingJavacTestGenerated extends AbstractLoadJava8UsingJavacTest {
    @TestMetadata("compiler/testData/loadJava8/compiledJava")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CompiledJava extends AbstractLoadJava8UsingJavacTest {
        public void testAllFilesPresentInCompiledJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/loadJava8/compiledJava"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, true);
        }

        @TestMetadata("InnerClassTypeAnnotation.java")
        public void testInnerClassTypeAnnotation() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/compiledJava/InnerClassTypeAnnotation.java");
            doTestCompiledJava(fileName);
        }

        @TestMetadata("MapRemove.java")
        public void testMapRemove() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/compiledJava/MapRemove.java");
            doTestCompiledJava(fileName);
        }

        @TestMetadata("TypeAnnotations.java")
        public void testTypeAnnotations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/compiledJava/TypeAnnotations.java");
            doTestCompiledJava(fileName);
        }

        @TestMetadata("TypeParameterAnnotations.java")
        public void testTypeParameterAnnotations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/compiledJava/TypeParameterAnnotations.java");
            doTestCompiledJava(fileName);
        }
    }

    @TestMetadata("compiler/testData/loadJava8/sourceJava")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SourceJava extends AbstractLoadJava8UsingJavacTest {
        public void testAllFilesPresentInSourceJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/loadJava8/sourceJava"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, true);
        }

        @TestMetadata("MapRemove.java")
        public void testMapRemove() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/sourceJava/MapRemove.java");
            doTestSourceJava(fileName);
        }

        @TestMetadata("TypeAnnotations.java")
        public void testTypeAnnotations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/sourceJava/TypeAnnotations.java");
            doTestSourceJava(fileName);
        }

        @TestMetadata("TypeParameterAnnotations.java")
        public void testTypeParameterAnnotations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/loadJava8/sourceJava/TypeParameterAnnotations.java");
            doTestSourceJava(fileName);
        }
    }
}

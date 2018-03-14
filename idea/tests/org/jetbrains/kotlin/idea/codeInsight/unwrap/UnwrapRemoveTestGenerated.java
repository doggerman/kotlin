/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight.unwrap;

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
public class UnwrapRemoveTestGenerated extends AbstractUnwrapRemoveTest {
    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/removeExpression")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RemoveExpression extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInRemoveExpression() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/removeExpression"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("ifInBlock.kt")
        public void testIfInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/removeExpression/ifInBlock.kt");
            doTestExpressionRemover(fileName);
        }

        @TestMetadata("ifInExpressionInReturn.kt")
        public void testIfInExpressionInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/removeExpression/ifInExpressionInReturn.kt");
            doTestExpressionRemover(fileName);
        }

        @TestMetadata("ifInReturn.kt")
        public void testIfInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/removeExpression/ifInReturn.kt");
            doTestExpressionRemover(fileName);
        }

        @TestMetadata("tryInBlock.kt")
        public void testTryInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/removeExpression/tryInBlock.kt");
            doTestExpressionRemover(fileName);
        }

        @TestMetadata("tryInReturn.kt")
        public void testTryInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/removeExpression/tryInReturn.kt");
            doTestExpressionRemover(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapThen")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UnwrapThen extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInUnwrapThen() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/unwrapThen"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("thenCompoundInBlock.kt")
        public void testThenCompoundInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapThen/thenCompoundInBlock.kt");
            doTestThenUnwrapper(fileName);
        }

        @TestMetadata("thenCompoundInReturn.kt")
        public void testThenCompoundInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapThen/thenCompoundInReturn.kt");
            doTestThenUnwrapper(fileName);
        }

        @TestMetadata("thenSimpleInReturn.kt")
        public void testThenSimpleInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapThen/thenSimpleInReturn.kt");
            doTestThenUnwrapper(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapElse")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UnwrapElse extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInUnwrapElse() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/unwrapElse"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("elseCompoundInBlock.kt")
        public void testElseCompoundInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapElse/elseCompoundInBlock.kt");
            doTestElseUnwrapper(fileName);
        }

        @TestMetadata("elseCompoundInReturn.kt")
        public void testElseCompoundInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapElse/elseCompoundInReturn.kt");
            doTestElseUnwrapper(fileName);
        }

        @TestMetadata("elseSimpleInReturn.kt")
        public void testElseSimpleInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapElse/elseSimpleInReturn.kt");
            doTestElseUnwrapper(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/removeElse")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RemoveElse extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInRemoveElse() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/removeElse"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("else.kt")
        public void testElse() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/removeElse/else.kt");
            doTestElseRemover(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLoop")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UnwrapLoop extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInUnwrapLoop() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/unwrapLoop"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("doWhile.kt")
        public void testDoWhile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLoop/doWhile.kt");
            doTestLoopUnwrapper(fileName);
        }

        @TestMetadata("for.kt")
        public void testFor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLoop/for.kt");
            doTestLoopUnwrapper(fileName);
        }

        @TestMetadata("while.kt")
        public void testWhile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLoop/while.kt");
            doTestLoopUnwrapper(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapTry")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UnwrapTry extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInUnwrapTry() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/unwrapTry"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("tryCompoundInBlock.kt")
        public void testTryCompoundInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapTry/tryCompoundInBlock.kt");
            doTestTryUnwrapper(fileName);
        }

        @TestMetadata("tryCompoundInReturn.kt")
        public void testTryCompoundInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapTry/tryCompoundInReturn.kt");
            doTestTryUnwrapper(fileName);
        }

        @TestMetadata("trySimpleInReturn.kt")
        public void testTrySimpleInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapTry/trySimpleInReturn.kt");
            doTestTryUnwrapper(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapCatch")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UnwrapCatch extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInUnwrapCatch() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/unwrapCatch"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("catchCompoundInBlock.kt")
        public void testCatchCompoundInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapCatch/catchCompoundInBlock.kt");
            doTestCatchUnwrapper(fileName);
        }

        @TestMetadata("catchCompoundInReturn.kt")
        public void testCatchCompoundInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapCatch/catchCompoundInReturn.kt");
            doTestCatchUnwrapper(fileName);
        }

        @TestMetadata("catchSimpleInReturn.kt")
        public void testCatchSimpleInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapCatch/catchSimpleInReturn.kt");
            doTestCatchUnwrapper(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/removeCatch")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RemoveCatch extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInRemoveCatch() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/removeCatch"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("catch.kt")
        public void testCatch() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/removeCatch/catch.kt");
            doTestCatchRemover(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapFinally")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UnwrapFinally extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInUnwrapFinally() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/unwrapFinally"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("finallyCompoundInBlock.kt")
        public void testFinallyCompoundInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapFinally/finallyCompoundInBlock.kt");
            doTestFinallyUnwrapper(fileName);
        }

        @TestMetadata("finallyCompoundInReturn.kt")
        public void testFinallyCompoundInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapFinally/finallyCompoundInReturn.kt");
            doTestFinallyUnwrapper(fileName);
        }

        @TestMetadata("finallySimpleInReturn.kt")
        public void testFinallySimpleInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapFinally/finallySimpleInReturn.kt");
            doTestFinallyUnwrapper(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/removeFinally")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RemoveFinally extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInRemoveFinally() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/removeFinally"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("finallyInBlock.kt")
        public void testFinallyInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/removeFinally/finallyInBlock.kt");
            doTestFinallyRemover(fileName);
        }

        @TestMetadata("finallyInReturn.kt")
        public void testFinallyInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/removeFinally/finallyInReturn.kt");
            doTestFinallyRemover(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UnwrapLambda extends AbstractUnwrapRemoveTest {
        public void testAllFilesPresentInUnwrapLambda() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("lambdaCallCompoundInBlock.kt")
        public void testLambdaCallCompoundInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda/lambdaCallCompoundInBlock.kt");
            doTestLambdaUnwrapper(fileName);
        }

        @TestMetadata("lambdaCallCompoundInReturn.kt")
        public void testLambdaCallCompoundInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda/lambdaCallCompoundInReturn.kt");
            doTestLambdaUnwrapper(fileName);
        }

        @TestMetadata("lambdaCallInBlock.kt")
        public void testLambdaCallInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda/lambdaCallInBlock.kt");
            doTestLambdaUnwrapper(fileName);
        }

        @TestMetadata("lambdaCallInBlock2.kt")
        public void testLambdaCallInBlock2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda/lambdaCallInBlock2.kt");
            doTestLambdaUnwrapper(fileName);
        }

        @TestMetadata("lambdaCallSimpleInReturn.kt")
        public void testLambdaCallSimpleInReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda/lambdaCallSimpleInReturn.kt");
            doTestLambdaUnwrapper(fileName);
        }

        @TestMetadata("lambdaInBlock.kt")
        public void testLambdaInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda/lambdaInBlock.kt");
            doTestLambdaUnwrapper(fileName);
        }

        @TestMetadata("lambdaNonLocalPropertyCompoundInBlock.kt")
        public void testLambdaNonLocalPropertyCompoundInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda/lambdaNonLocalPropertyCompoundInBlock.kt");
            doTestLambdaUnwrapper(fileName);
        }

        @TestMetadata("lambdaNonLocalPropertyInBlock.kt")
        public void testLambdaNonLocalPropertyInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda/lambdaNonLocalPropertyInBlock.kt");
            doTestLambdaUnwrapper(fileName);
        }

        @TestMetadata("lambdaPropertyCompoundInBlock.kt")
        public void testLambdaPropertyCompoundInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda/lambdaPropertyCompoundInBlock.kt");
            doTestLambdaUnwrapper(fileName);
        }

        @TestMetadata("lambdaPropertyInBlock.kt")
        public void testLambdaPropertyInBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/unwrapAndRemove/unwrapLambda/lambdaPropertyInBlock.kt");
            doTestLambdaUnwrapper(fileName);
        }
    }
}

package com.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Specify that this class runs a suite of tests
@RunWith(Suite.class)

// Specify the test classes to include in the suite
@Suite.SuiteClasses({
        TestClass3_Post.class,
        TestClass4_Post.class,
})

public class TestSuite_Post {
    // This class remains empty, used only as a holder for the above annotations
}

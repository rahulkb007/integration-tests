package com.bhartiya.citrus;

import com.consol.citrus.annotations.CitrusResource;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.runner.TestRunner;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * using Testng
 *
 * @author rahul
 * @since 2020-03-25
 */
public class MyFirstCitrusTestngIT extends TestNGCitrusTestRunner {
    @CitrusTest
    @Test
    @Parameters("testRunner")
    public void myFirstCitrusTestngIT(@CitrusResource @Optional TestRunner testRunner) {
        testRunner.echo("TODO: Code the test MyFirstCitrusTestngIT");

    }
}

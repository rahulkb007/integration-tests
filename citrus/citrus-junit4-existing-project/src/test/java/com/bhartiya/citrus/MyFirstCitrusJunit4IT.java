package com.bhartiya.citrus;

import com.consol.citrus.annotations.CitrusResource;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.junit.JUnit4CitrusTestRunner;
import com.consol.citrus.dsl.runner.TestRunner;
import org.junit.Test;

/**
 * using junit4 
 *
 * @author rahul
 * @since 2020-03-23
 */
public class MyFirstCitrusJunit4IT extends JUnit4CitrusTestRunner {
    @CitrusTest
    @Test
    public void myFirstCitrusJunit4IT(@CitrusResource TestRunner testRunner) {
        testRunner.echo("TODO: Code the test MyFirstCitrusJunit4IT");

    }
}

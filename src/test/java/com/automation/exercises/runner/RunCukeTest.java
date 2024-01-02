package com.automation.exercises.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 //LoginUser.feature
@CucumberOptions(
        features = "src/test/resources/featurefiles" ,
        glue     = "com/automation/exercises/steps" ,
        plugin   = {"html:target/cucumber-reports/cucumber.html" ,
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags     = " "
)
public class RunCukeTest extends AbstractTestNGCucumberTests
{

}

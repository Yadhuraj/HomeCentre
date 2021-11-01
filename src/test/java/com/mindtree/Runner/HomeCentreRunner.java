package com.mindtree.Runner;

import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
glue= {"com.mindtree.StepDefinition"},
monochrome = true)
public class HomeCentreRunner extends AbstractTestNGCucumberTests {

	public HomeCentreRunner() {
		
	}
 
}

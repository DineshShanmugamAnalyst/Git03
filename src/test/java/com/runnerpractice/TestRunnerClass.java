package com.runnerpractice;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(snippets=SnippetType.CAMELCASE,publish=true,dryRun=true,stepNotifications=true,monochrome=true,plugin={"pretty","junit:target/Output.xml"},name= "Verifying adactin login details with valid credentials",features="src\\test\\resources\\Features\\CucuOptions.feature",glue="com.stepdefinitionpractice")
public class TestRunnerClass {

	
	
	
}




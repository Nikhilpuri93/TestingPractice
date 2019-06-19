package com.bookshopping.practicesite.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/Feature"},
		glue="com.bookshopping.practicesite.stepdefinitions",
		monochrome=true,
		format={"pretty","html:test-output",
				"json:test-output/result.json",
				"junit:junit_xml_output/result.xml"},
		tags={"@shop,~@status"}
	
		)
public class BookShoppingRunner {
	

}

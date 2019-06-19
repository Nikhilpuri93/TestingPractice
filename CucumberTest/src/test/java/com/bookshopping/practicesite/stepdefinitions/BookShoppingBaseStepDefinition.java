package com.bookshopping.practicesite.stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.reporter.ExtentBDDReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.bookshopping.practicesite.Base.BaseClass;
import com.sun.source.tree.IntersectionTypeTree;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BookShoppingBaseStepDefinition extends BaseClass {
	
	/*ExtentReports extent;
	ExtentTest logger;
	*/
	
	@Before
	public void beforeExecutingScenario(Scenario scenario)
	{
		
		System.out.println("Running the scenario: "+scenario.getName());
		ExtentHtmlReporter reporter= new ExtentHtmlReporter(ReportLocation+"_"+timestamp+".html");
		//ExtentBDDReporter reporter= new ExtentBDDReporter(ReportLocation+"_"+timestamp+".html");
		
		extent=new ExtentReports();
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setDocumentTitle("BookShoppingReport");
		
		//features=extent.createTest(Feature.class,"Book Shopping feature");
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System", "Windows 10");
		extent.setSystemInfo("Browser", "Chrome");
		logger=extent.createTest(scenario.getName());
		//System.out.println("logger created");
		
		
	}
	@After
	public void afterExecutingScenario(Scenario sc) throws IOException
	{
		
		System.out.println("Running afterExecutingScenario()");
		System.out.println("Status of scenario: "+sc.getStatus());
		String screenshotname=sc.getName().replaceAll(" ","_");
		
		if(sc.isFailed())
		{
		/*	try {
				String file="screenshots/"+screenshotname+"_"+timestamp+".jpg";
				File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcfile, new File(file));
			//	logger.fail((sc.getStatus().toString()),MediaEntityBuilder.createScreenCaptureFromPath("file").build());
				logger.log(Status.FAIL,"test failed" );
				logger.addScreenCaptureFromPath(file);	
				//logger.fail("details",MediaEntityBuilder.createScreenCaptureFromPath(file).build());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 */
			//sc.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/jpg");
			String imagepath=BaseClass.captureScreenShot(screenshotname);
			logger.log(Status.FAIL,"test failed" );
			System.out.println("failed");
			//logger.addScreenCaptureFromPath(imagepath);	
		}
		
		System.out.println("Closing the browser");
		extent.flush();
		driver.close();
	}

}

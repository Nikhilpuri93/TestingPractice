package com.bookshopping.practicesite.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BaseClass {
	public static WebDriver driver;
	public static final String excelsheetpath="src/test/resources/data/TestData.xlsx";
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String ReportLocation="./reports/BookShoppingReport ";
	public static ExtentTest features;
	public static String timestamp = (new SimpleDateFormat("MM-dd-YYYY-hh-mm-ss")).format(new Date());


	public static void setUrl()
	{
		driver.get("http://practice.automationtesting.in/");
	}


	public static WebDriver driverForChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver driverForFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver driverForInterExplorerBrowser()
	{
		System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static String getCellValue(String excelsheetpath, int sheetnumber, int rowNum, int cellNum) throws InvalidFormatException {
		//System.out.println("sheetpath is"+excelsheetpath);
		//System.out.println("sheetname is"+sheetName);
		FileInputStream fis = null;
		Workbook wb = null;
		String value="";
		try {
			fis = new FileInputStream(excelsheetpath);
			wb = WorkbookFactory.create(fis);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Cell cell=wb.getSheetAt(sheetnumber).getRow(rowNum).getCell(cellNum);
		CellType type=cell.getCellType();
		if(type==type.STRING)
		{
			value=cell.getStringCellValue();
		}
		else if(type==type.NUMERIC)
		{
			value=Integer.toString((int)cell.getNumericCellValue());

		}

		return value;
	}
	public static void javaScriptExec(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void wait(WebElement element)
	{
		System.out.println("wait started");
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		System.out.println("wait complete");
	}
	public static void selectByText(WebElement element, String val) {
		Select dropdown = new Select(element);
		List<WebElement> options = dropdown.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(val)) {
				option.click();
				break;
			}
		}
	}
	public static String captureScreenShot(String name) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="screenshots/"+name+"_"+timestamp+".jpg";
		File dest=new File(destination);

		FileUtils.copyFile(src,dest);
		//	logger.fail((sc.getStatus().toString()),MediaEntityBuilder.createScreenCaptureFromPath("file").build());
		/*logger.log(Status.FAIL,"test failed" );
		logger.addScreenCaptureFromPath(file);	*/
		//logger.fail("details",MediaEntityBuilder.createScreenCaptureFromPath(file).build());
		return destination;
	}
	/*public String getReportConfigPath(){

		String reportConfigPath = System.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}*/
}

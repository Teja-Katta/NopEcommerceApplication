package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Properties p;
	public Logger logger;
	
	@BeforeClass(groups= {"sanity"})
	@Parameters({"os","browser"})
	public void setUp(String os, String br) throws IOException
	{
		FileReader file=new FileReader(".//src/test/resources//config.Properties");
		p=new Properties();
		p.load(file);
		
		logger=LogManager.getLogger(this.getClass());

		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver(); break;
		case "edge" :driver=new EdgeDriver(); break;
		default: System.out.println("No browser matching..");
		return;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("url"));
		
	}
	
	
	@AfterClass(groups= {"sanity"})
	public void teardown()
	{
		driver.quit();
	}
	
	
	public String randomeString()
	{
		//String generatedString=RandomStringUtils.randomAlphabetic(5);
		//return generatedString;
	String generatedString=RandomStringUtils.randomAlphabetic(5);
	return generatedString;
		
	}
	public String randomNumber()
	{
		String generatedNumber=RandomStringUtils.randomAlphanumeric(5);
		return generatedNumber;
	}
	
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(5);
		String num=RandomStringUtils.randomAlphanumeric(5);
		String mixedval=str+"@"+num;
		return mixedval;
	}
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenShots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}

}

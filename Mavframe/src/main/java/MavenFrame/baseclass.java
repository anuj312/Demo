package MavenFrame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	
public static WebDriver driver; Properties prop;
	
public void RunBrowser() throws IOException
	{
	prop = new Properties();
	FileInputStream fis = new FileInputStream("E:\\eclipse\\Mavframe\\src\\main\\java\\MavenFrame\\file.properties");
	prop.load(fis);
	
	String browser = prop.getProperty("browser");
	
	if(browser.equals("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenketaPC\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

public void screenshot(String result) throws IOException
{
	       File src =(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(src, new File("C:\\Users\\VenketaPC\\Downloads\\"+result+".jpg"));
}


   







}

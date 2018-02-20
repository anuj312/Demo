package MavenFrame;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login extends baseclass {
	
	private static Logger log = LogManager.getLogger(baseclass.class.getName());
	@Test(dataProvider="getdata")
	public void login(String user, String pass, String text) throws IOException, InterruptedException
	{
		RunBrowser();
		driver.get(prop.getProperty("url"));
		
		PageObject logg = new PageObject(driver);
		logg.username().sendKeys(user);
		log.info("user name entered");
		logg.password().sendKeys(pass);
		log.info("password is entered");
		System.out.println(text);
		
		//logg.submit().click();
		log.debug("CLICKED SUCCESFULLY");
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][3];
		
		data[0][0]="anuj";
		data[0][1]="lol";
		data[0][2]="lol";
	 
		data[1][0]="rana";
		data[1][1]="rana";
		data[1][2]="rana";
		
		
		return data;
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	

}


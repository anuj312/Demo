package MavenFrame;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class match extends baseclass {
	
	private static Logger log = LogManager.getLogger(baseclass.class.getName());
	
	
	@Test
	public void match() throws IOException
	{
		RunBrowser();
		log.info("Browser is Invoking");
		
		driver.get(prop.getProperty("url"));
	log.info("website is running");
		
		PageObject po = new PageObject(driver);
		
		String match = po.match().getText();
		
		if(match.equals("Create an account"))
		{
			System.out.println("FUCK YEAH");
		log.info("Assertion  match is true");
		}
		
		Assert.assertEquals(match, "Create an account");
		
		System.out.println(driver.getTitle());
		
		
	}

}

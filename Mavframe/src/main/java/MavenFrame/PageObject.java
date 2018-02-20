package MavenFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject extends baseclass {
	
	By match = By.xpath(".//*[@id='content']/div/div/div/div/div[2]/div[1]/div[1]/span");
	By id = By.id("email");
	By pass = By.id("pass");
	By submit = By.xpath("(.//*[@type='submit'])[1]");

	public PageObject(WebDriver driver) {
		
		this.driver=driver;
		
	}
    
	public WebElement match()
	{
		return driver.findElement(match);
	}
	
	public WebElement username()
	{
		return driver.findElement(id);
	}
	
	
	public WebElement password()
	{
		return driver.findElement(pass);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	
	
		
		
		


}

package MavenFirst.Maven;

import org.testng.annotations.Test;

public class Second {

	@Test
	public void Test()
	{
		System.out.println("TEST ONE");
	}
	
	@Test(groups= {"smoke"})
	public void Test1()
	{
		System.out.println("TEST TWO");
	}
	

}

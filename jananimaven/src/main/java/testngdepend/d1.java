package testngdepend;

import org.testng.annotations.Test;

public class d1 {

	//dependsOnMethods: create connection between test cases 
	
	@Test(priority=0)
	public void visiting()
	{
		System.out.println("Visiting");
	}
	
	@Test(priority=1,dependsOnMethods="visiting")
	public void login()
	{
		System.out.println("login");
	}
}

package testngdepend;

import org.testng.annotations.Test;

public class d2 {
	
	@Test(priority=0,groups="K")
	public void a1()
	{
		System.out.println("t1");
	}
	
	
	@Test(priority=1,groups="K")
	public void a2()
	{
		System.out.println("t2");
	}
	
	
	@Test(priority=2,dependsOnGroups="K")
	public void b()
	{
		System.out.println("t3");
	}

}

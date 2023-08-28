package testngattributes;

import org.testng.annotations.Test;

public class t1 {

	/*
	 *testng: test next generation
	 *tsting framework
	 *inspired from JUNIt
	 *annoations, assertions, parallel, suite...
	 *automatic report generation is there 
	 *
	 * test case 
	 *      nonstatic n nature
	 *      @Test
	 *      default oder: alphabetical order 
	 *      
	 *      priority: arrange the test case in particular order 
	 *      desription: add short note on the test case 
	 *      groups: 
	 *      invocation count
	 *      enabled=false 
	 *      timeout
	 * 
	 * */
	
	@Test(priority=0,description="ONE",groups="O",invocationCount=5,enabled=false )
	public void m1()
	{
		System.out.println("Tc1");
	}
	
	@Test(priority=1,description="TW0",groups="O")
	public void m2()
	{
		System.out.println("Tc2");
	}
	
	@Test(priority=2,description="Threee",groups="F")
	public void ab()
	{
		System.out.println("Tc3");
	}
}

package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	/*
	 * before test: run only once before all the test cases started its execution
	 * after test:  run only once after all the test cases finished its execution
	 * 
	 * before class: run only once after before test 
	 * after class: run only once before after test 
	 * 
	 * before method: run before each test case
	 * after method: run after each test case 
	 * 
	 * 
	 * before test: visiting
	 *    before class : maximisng
	 *        before method: refresh     tc1 : title    aftermethod: deleting cookies 
	 *        before method: refresh    tc2  : click   aftermethod : deleting cookies 
	 *    after class: getting url
	 * after test: closing
	 * 
	 * 
	 * 
	 * */
	 ChromeDriver driver;
	@BeforeMethod
	public void btm()
	{
		System.out.println("before method");
		driver.navigate().refresh();
	}
	
	@AfterMethod
	public void batm()
	{
		System.out.println("After method");
		driver.manage().deleteAllCookies();
	}
	
	@BeforeClass
	public void btc()
	{
		System.out.println("before class");
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void atc()
	{
		System.out.println("after class");
		System.out.println(driver.getCurrentUrl());
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before test ");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.get("http://www.google.com");//1
	}
	
	@AfterTest
	public void bta()
	{
		System.out.println("after test");
		driver.quit();
	}
	
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test case 1 "+ driver.getTitle());
	}
	
	
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("Tst case 2");
		driver.findElementByLinkText("Images").click();
	}

}

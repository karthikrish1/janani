package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testnglist.i1.class)
public class a1 {
	/*
	 * assertion; technique where we will be comparing actual result with obtained result
	 * 
	 * hard
	 *     provied by assert builtin class
	 *     static in nature
	 *     assert fails=> it wont proceed further 
	 *     
	 * soft asserts
	 *     provided by softassert builtin class
	 *     nonstatic in nature
	 *     even if it fails=> it will proceed further 
	 *     know the actual result: invoke assertAll()
	 * 
	 * assertEqual(actual, expected)
	 * assertNotEqual(actual,expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * 
	* 
	 * */
	
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	        driver.get("http://www.google.com");
	       // Assert.assertEquals(driver.getTitle(), "Googlembkb");
	        Assert.assertNotEquals(driver.getTitle(), "Googlembkb");
	        WebElement ele = driver.findElementByLinkText("Images");
	        Assert.assertTrue(ele.isDisplayed());
	        Assert.assertFalse(ele.isSelected());
	        driver.quit();
	}

}

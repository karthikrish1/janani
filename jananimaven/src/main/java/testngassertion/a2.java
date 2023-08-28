package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {
	
	
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	        driver.get("http://www.google.com");
	        SoftAssert s= new SoftAssert();
	       s.assertEquals(driver.getTitle(), "Googlembkb");
	       s.assertNotEquals(driver.getTitle(), "Googlembkb");
	        WebElement ele = driver.findElementByLinkText("Images");
	       s.assertTrue(ele.isDisplayed());
	        s.assertFalse(ele.isSelected());
	        driver.quit();
	        s.assertAll();
	}

}

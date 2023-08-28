package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class exp {
/*
 * explicit wait
 *     create an object for webdriver wait class
 *     pass driver instance and time limit as input
 *     call untill metod
 *     call conditions* 
 * 
	code is correct : executes within time limit, it will proceed further , it wont wait for the completion of time limit
	 *      code is wrong: wait for the completiom of time limit, then it wikk throw up error
	 *  * 
	 * */
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	        driver.get("http://www.google.com");
	        WebDriverWait w= new WebDriverWait(driver,5);
	        
	        //title
	       // w.until(ExpectedConditions.titleIs("Gonlkogle"));//5
	        
	        //w.until(ExpectedConditions.titleContains("oo")); //5
	        
	        //alert
	        
	        //w.until(ExpectedConditions.alertIsPresent()); //5
	        
	        //visibility of element
	        
	       // w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
	        
	        // visibility of more elements
	       // w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
	        
	        //element is clickable or not
	        w.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));
	        
	        driver.quit();
	}
}

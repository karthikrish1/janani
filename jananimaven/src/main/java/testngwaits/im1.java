package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class im1 {
	
	/*testng waits:
	 *     conditional : explicit wait
	 *     unconditional: implicit wait
	 *     
	 *     
	 *     implicit wait:
	 *         once it is declared all the code which is present after it ill take the time limit
	 *         
	 *         
	 *      code is correct : executes within time limit, it will proceed further , it wont wait for the completion of time limit
	 *      code is wrong: wait for the completiom of time limit, then it wikk throw up error
	 *  * 
	 * */
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	        driver.get("http://www.google.com");
	        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	        System.out.println(driver.getTitle());//6
	        System.out.println(driver.getCurrentUrl());//6
	        driver.navigate().refresh();//6
	        driver.findElementByLinkText("Imagdfdfes"); //6
	        driver.quit();//6
	}
	

}

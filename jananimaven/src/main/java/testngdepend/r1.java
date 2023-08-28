package testngdepend;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class r1 {
	ChromeDriver driver;
	@Test(priority=0,description="viisiting",groups="J1")
	public void vst()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
	}
	
	@Test(priority=1,description="maximising",groups="J1")
	public void max()
	{
		driver.manage().window().maximize();
	}
	
	@Test(priority=2,description="refreshing",invocationCount=3,groups="J1")
	public void refreshing()
	{
		driver.navigate().refresh();
	}
	
	@Test(priority=3,description="clicking",dependsOnGroups="J1")
	public void clicking()
	{
		driver.findElementByLinkText("Gmail").click();
	}
	
	@Test(priority=4,description="closing",dependsOnGroups="J1")
	public void closing() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	

}

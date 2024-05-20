package ctruh_2_Home_page;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ctruh_04_Almost_There {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.ctruh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//button[@id='test-df41e5a3-a33d-4165-9c8c-7717c9b37066']")).click();

	}

	@Test
	public void Google_test() {
		driver.findElement(By.xpath("//body/div[1]/div[2]/div[2]/div[3]/div[1]/img[1]")).click();
	}
	
	@Test
	public void Facebook_test() {
		driver.findElement(By.id("test-c3dbe21e-833d-467f-ab76-d20625fd77af")).click();
	}
	
	@Test
	public void Git_test() {
		driver.findElement(By.id("test-6a954a8b-f8d9-497e-8988-678788ad111c")).click();
	}
	
	@Test
	public void Link_test() {
	driver.findElement(By.id("test-a52ef05b-bd94-4aff-8e0f-526d408ec2ee")).click();	
	
	driver.findElement(By.xpath("//a[contains(text(),'Terms of Service')]")).click();
	}
	
	@Test
	public void Terms_of_Service_andPrivacy_Policy_test() throws InterruptedException {	
	driver.findElement(By.xpath("//a[contains(text(),'Terms of Service')]")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();
	Thread.sleep(2000);
	
	
	}
	
	
	@After
	public void tearDown() throws Exception {
	Thread.sleep(4000);
	driver.quit();
	}


}

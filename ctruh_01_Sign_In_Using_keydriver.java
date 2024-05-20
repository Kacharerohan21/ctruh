package ctruh_2_Home_page;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ctruh_01_Sign_In_Using_keydriver {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.ctruh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Test
	public void test() {
		driver.findElement(By.id("test-df41e5a3-a33d-4165-9c8c-7717c9b37066")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("test-6f73538b-e767-46da-9e77-dff6525f632f")).sendKeys(" Please enter your email ID ");
		driver.findElement(By.id("test-15ae0d76-9f92-4a12-9ad6-645eebc74a9f")).sendKeys("Please enter your Password");
		driver.findElement(By.id("test-8e5c296f-096d-4597-9027-cb2aa99e0134")).click();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}

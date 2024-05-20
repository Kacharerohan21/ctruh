package ctruh_2_Home_page;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ctruh_03_Editor_Template {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.ctruh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("test-df41e5a3-a33d-4165-9c8c-7717c9b37066")).click();
	}

	@Test
	public void Bedroom_Scene() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("test-6f73538b-e767-46da-9e77-dff6525f632f")).sendKeys("rohan@gmail.com");
		driver.findElement(By.id("test-15ae0d76-9f92-4a12-9ad6-645eebc74a9f")).sendKeys("Password123$");
		driver.findElement(By.id("test-8e5c296f-096d-4597-9027-cb2aa99e0134")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[1]/button[1]/span")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");

	}

	@Test
	public void Interior_Design() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("test-6f73538b-e767-46da-9e77-dff6525f632f")).sendKeys("rohan@gmail.com");
		driver.findElement(By.id("test-15ae0d76-9f92-4a12-9ad6-645eebc74a9f")).sendKeys("Password123$");
		driver.findElement(By.id("test-8e5c296f-096d-4597-9027-cb2aa99e0134")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Interior Design')]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");

	}

	@Test
	public void Living_Room_Scene() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("test-6f73538b-e767-46da-9e77-dff6525f632f")).sendKeys("rohan@gmail.com");
		driver.findElement(By.id("test-15ae0d76-9f92-4a12-9ad6-645eebc74a9f")).sendKeys("Password123$");
		driver.findElement(By.id("test-8e5c296f-096d-4597-9027-cb2aa99e0134")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Living Room Scene')]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");

	}

	@Test
	public void Modern_Scene() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("test-6f73538b-e767-46da-9e77-dff6525f632f")).sendKeys("rohan@gmail.com");
		driver.findElement(By.id("test-15ae0d76-9f92-4a12-9ad6-645eebc74a9f")).sendKeys("Password123$");
		driver.findElement(By.id("test-8e5c296f-096d-4597-9027-cb2aa99e0134")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Modern Scene')]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");

	}

	@Test
	public void Other() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("test-6f73538b-e767-46da-9e77-dff6525f632f")).sendKeys("rohan@gmail.com");
		driver.findElement(By.id("test-15ae0d76-9f92-4a12-9ad6-645eebc74a9f")).sendKeys("Password123$");
		driver.findElement(By.id("test-8e5c296f-096d-4597-9027-cb2aa99e0134")).click();
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[2]/div[1]/div[1]/button[5]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}

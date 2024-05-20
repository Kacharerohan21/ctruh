package ctruh_2_Home_page;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ctruh_05_Recover_Account {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.ctruh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//button[@id='test-df41e5a3-a33d-4165-9c8c-7717c9b37066']")).click();

	}

	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}

	@Test
	public void test() {
	driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
	driver.findElement(By.id("test-d78d9bbd-2f32-47d3-bdef-4162a009e57f")).click();
	WebElement Email=driver.findElement(By.id("test-d52d6280-823d-41a5-9151-dcc6712f5110"));
	Email.sendKeys("New@gmail.com");
	WebElement Mobile=driver.findElement(By.xpath("//body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/input[1]"));
	Mobile.sendKeys("123456789");
	driver.findElement(By.id("test-cee967bb-e29e-440a-aca6-565032d1bc28")).click();
	}

}

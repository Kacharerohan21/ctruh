package ctruh_2_Home_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ctruh_02_Home_to_Edit_dashboard {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ctruh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("test-df41e5a3-a33d-4165-9c8c-7717c9b37066")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("test-6f73538b-e767-46da-9e77-dff6525f632f")).sendKeys("rohan@gmail.com");
		driver.findElement(By.id("test-15ae0d76-9f92-4a12-9ad6-645eebc74a9f")).sendKeys("Password123$");
		driver.findElement(By.id("test-8e5c296f-096d-4597-9027-cb2aa99e0134")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[1]/p")).click();
		driver.findElement(By.xpath("//span[contains(text(),'PROJECTS')]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}

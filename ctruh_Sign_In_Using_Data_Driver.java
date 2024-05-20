package ctruh_2_Home_page;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ctruh_Sign_In_Using_Data_Driver {

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
		
		
		try {
			FileInputStream ExcelFile = new FileInputStream(
					new File("D:\\Automation\\Workspace\\ctruh_2\\src\\test\\java\\ctruh_2_Test_Data\\ExcelFile.xlsx"));
			Workbook workbook = WorkbookFactory.create(ExcelFile);
			Sheet sheet = workbook.getSheetAt(0);
			for (Row row : sheet) {
				String data1 = row.getCell(0).getStringCellValue();
				String data2 = row.getCell(1).getStringCellValue();

				WebElement inputName = driver.findElement(By.id("test-6f73538b-e767-46da-9e77-dff6525f632f"));
				inputName.sendKeys(data1);

				WebElement inputEmail_ID = driver.findElement(By.id("test-15ae0d76-9f92-4a12-9ad6-645eebc74a9f"));
				inputEmail_ID.sendKeys(data2);

				driver.findElement(By.id("test-8e5c296f-096d-4597-9027-cb2aa99e0134")).click();

				inputName.clear();
				inputEmail_ID.clear();
				Thread.sleep(2000);
			}
			workbook.close();
			ExcelFile.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}

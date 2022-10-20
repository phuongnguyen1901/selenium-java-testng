package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_selenium_locator {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String osName = System.getProperty("os.name");

	@BeforeClass
	public void beforeClass() {
		if(osName.contains("Mac OS"))
		{
		System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
		} else {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		}
		driver = new FirefoxDriver();
		driver.manage	().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
	}	

	@Test
	public void TC_01_ID() {
		driver.findElement(By.id("FirstName")).sendKeys("Phuong");
	
	}

	@Test
	public void TC_02_Class() {
		driver.get("https://demo.nopcommerce.com/search");
		driver.findElement(By.className("search-text")).sendKeys("Love");
		
	
	}

	@Test
	public void TC_03_Name() {
		driver.findElement(By.name("advs")).click();
	
	}
	@Test
	public void TC_04_TagName() {
	//tìm số thẻ input trên màn hình hiện tại
		System.out.println(driver.findElements(By.tagName("input")).size());
	}
	@Test
	public void TC_05_Linktext() {
	//Click vào đường link ;
		driver.findElement(By.linkText("Addresses")).click();
		
	}
	@Test
	public void TC_05_PartialLinkText() {
	driver.findElement(By.partialLinkText("Apply for vendor")).click();
	}
	@Test
	public void TC_07_CSS() {
	driver.get("https://demo.nopcommerce.com/register");
	driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Lê");
	driver.findElement(By.cssSelector("input[name=\"LastName\"]")).sendKeys("Thị");
	driver.findElement(By.cssSelector("input[id=\"Email\"]")).sendKeys("phuongle@mail.com");
	}
	@Test
	public void TC_08_Xpath() {
		driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("Teracom");
		driver.findElement(By.xpath("//a[text()= \"New products\"]")).click();
	
	}
	@AfterClass
	public void afterClass() {
	 //driver.quit();
	}
}
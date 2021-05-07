package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class myTest {

	public String baseUrl = "https://www.google.com/";
	public WebDriver driver ; 


	@Test
	public void searchPage() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit();
        driver.close();
	}
}   	  


package RedBusAutomation.RedBusAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusAutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
		
		// Disable notifications
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	   By source=	By.xpath("//div[@class=\"inputAndSwapWrapper___0efe74\"]");
		
		wait.until(ExpectedConditions.elementToBeClickable(source)).click();
		
		 By sourceInput=By.xpath("//input[@id='srcinput']");
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(sourceInput)).sendKeys("Mumbai");
		
		
		
		
	}

}

package Suni_Shwe_Likith;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummyClass {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.findElement(By.id("name")).sendKeys("Shwetha");
	Thread.sleep(2000);
	driver.close();
}
}


package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Books")).click();
		//driver.findElement(By.linkText("Women")).click();
		
		



	}

}

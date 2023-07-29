package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("gokul.sekar@testleaf.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Java$232");

		driver.findElement(By.xpath("//input[@id='Login']")).click();
		

	}

}

package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {

ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
        driver.findElement(By.className("decorativeSubmit")).click();
		
		//to use link locator
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		
		//Click on Phone
	     //Enter phone number
		//Click find leads button
		//	Capture lead ID of First Resulting lead
		
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
		
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("91");
		
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8056324739");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
				
		Thread.sleep(2000);
		
		String deleteid = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
				
		System.out.println(deleteid);
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		
		
		
		

		//Click Delete
		//Click Find leads
		//	Enter captured lead ID
		//	Click find leads button
		//	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		//	Close the browser

		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(deleteid);
		
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	String deleteconfirmsg = driver.findElement(By.className("x-paging-info")).getText();
	
		System.out.println("Your record deleted is confirmed");
		
		driver.close();
		
	}

}

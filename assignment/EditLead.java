package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
        driver.findElement(By.className("decorativeSubmit")).click();
		
		//to use link locator
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads link
		//	Click Find leads
		//	Enter first name
		//	Click Find leads button
		// Click on first resulting lead
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("ilakkiya");
		
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//driver.findElement(By.xpath("//a[text()='10148']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		//driver.findElement(By.linkText(""))
		
		//Verify title of the page
		// Click Edit
		// Change the company name
		// Click Update
		// Confirm the changed name appears
		// Close the browser (Do not log out)
		
		String title = driver.getTitle();
		
			System.out.println(title);
			
			driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
			
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("HomeCentre");
			
			driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
			
			driver.close();
		
		
	
				
		

	}

}

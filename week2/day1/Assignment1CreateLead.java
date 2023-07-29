package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		//Create uname, pwd using locator
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//to use link locator
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//to create locator for leads and CreateLead button
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter CompanyName Field Using id Locator
		 // Enter FirstName Field Using id Locator
		//Enter LastName Field Using id Locator
		  // Enter FirstName(Local) Field Using id Locator

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LandmarkGroup");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ilakkiya");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Palanivelu");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ila");
		
		//Enter Department Field Using any Locator of Your Choice

		//Enter Description Field Using any Locator of your choice 
		 
		// Enter your email in the E-mail address Field using the locator of your choice

		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("To test the code how it is working");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ilakkiya1712@gmail.com");
		
		// Select State/Province as NewYork Using Visible Text
		// Click on Create Button

		
		
	
	
	        WebElement drop=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	
	        Select obj =new Select(drop);
	        
	        obj.selectByVisibleText("New York");
	        
	       
	        
	
		

	}

}

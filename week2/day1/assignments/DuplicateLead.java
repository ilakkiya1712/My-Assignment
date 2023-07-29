package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		
ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
        driver.findElement(By.className("decorativeSubmit")).click();
		
		//to use link locator
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click on Leads Button
		   
		 // Click on create Lead Button
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter CompanyName using id Locator
		   
				// Enter FirstName using id Locator
				   
				// Enter LastName using id Locator
				
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Lankmarkgroup");
        
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ila");
        
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Palani");
        
       // Enter FirstName(Local) Field Using id Locator
		 // Enter Department Field Using any Locator of Your Choice
		  // Enter Description Field Using any Locator of your choice 
		  // Enter your email in the E-mail address Field using the locator of your choice
		  // Click on Create Button
        
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dhana");
        
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
        
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Test Engineer Batch");
        
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ilakkiya1712@gmail.com");
        
        driver.findElement(By.name("submitButton")).click();
        
        // Get the Title of Resulting Page using driver.getTitle()
        // Click on Duplicate button
        // Clear the CompanyName Field using .clear() And Enter new CompanyName
        // Clear the FirstName Field using .clear() And Enter new FirstName
          
        String title = driver.getTitle();
        
        System.out.println(title);
        
        driver.findElement(By.linkText("Duplicate Lead")).click();
        
        driver.findElement(By.id("createLeadForm_companyName")).clear();
        
        driver.findElement(By.id("createLeadForm_firstName")).clear();
        
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ilakk");
        
        // Click on Create Lead Button
        // Get the Title of Resulting Page using driver.getTitle()
        
        
        driver.findElement(By.name("submitButton")).click();
        
        String title1 = driver.getTitle();
        
        System.out.println(title1);

        
        
        
        
        
	}

}

package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		   
		// Select value as Employee in Source Using SelectbyVisible text
		   
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Lankmarkgroup");
        
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ila");
        
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Palani");
        
        WebElement sour= driver.findElement(By.id("createLeadForm_dataSourceId"));
        
        Select sourobj = new Select(sour);
        
        sourobj.selectByVisibleText("Employee");
        
        //Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
 	   
 	   
 	   //Select value as Corporation in OwnerShip field Using SelectbyIndex
 	   
 	   // Select value as India in Country Field Using SelectbyVisibletext
 	    
 	   // Click on create Lead Button Using name Locator
 	   
 	   // Get the Title of the resulting Page
        
        
        WebElement mark = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        
        Select obmark = new Select(mark);
        
        obmark.selectByValue("9001");
        
        WebElement corp = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        
        Select obcorp = new Select(corp);
        
        obcorp.selectByIndex(5);
        
        WebElement coun = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
        
        Select obcoun = new Select(coun);
        
        obcoun.selectByVisibleText("India");
        
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
	}

}

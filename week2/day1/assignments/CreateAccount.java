package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
	
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
        driver.findElement(By.className("decorativeSubmit")).click();
		
		//to use link locator
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		// Click on Create Account
	    
		// Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		   
		 //  Enter DEscriptiion as "Selenium Automation Tester"
		
		driver.findElement(By.linkText("Create Account")).click();
		
		
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		
		// Enter LocalName Field Using Xpath Locator
		   
		//    Enter SiteName Field Using Xpath Locator
		   
		  // Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute

		
		   driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Palanivelu");
		   
		   driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("madinat zayed site");
		   
		   driver.findElement(By.xpath("(//input[@Class='inputBox'])[5]")).sendKeys("2,50,000");
		   
           //Select Industry as ComputerSoftware
		   
		   // Select OwnerShip as S-Corporation using SelectByVisibletext
		   
		   //Select Source as Employee using SelectByValue
		   
		   //Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex

          WebElement ila=driver.findElement(By.name("industryEnumId"));
	       
	       Select ob =new Select(ila);
	       
	       ob.selectByVisibleText("Computer Software");
	       
	       WebElement ila1=driver.findElement(By.name("ownershipEnumId"));
	       
	       Select ob1=new Select(ila1);
	       
	       ob1.selectByVisibleText("S-Corporation");
	       
	       WebElement ila2=driver.findElement(By.id("dataSourceId"));
	       
	       Select ob2 =new Select(ila2);
	       
	       ob2.selectByValue("LEAD_EMPLOYEE");
	       
	       WebElement mc= driver.findElement(By.id("marketingCampaignId"));
	       
	       Select obj=new Select(mc);
	       
	       obj.selectByIndex(6);
	       
	       
     //Select State/Province as Texas using SelectByValue 
		   
	//Click on Create Account using Xpath Locator
	       
		WebElement sp= driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select object = new Select(sp);
		
		object.selectByValue("Texas");
		
		driver.findElement(By.xpath("//input[@Class='smallSubmit']")).click();
	
	       
	       

	}

}

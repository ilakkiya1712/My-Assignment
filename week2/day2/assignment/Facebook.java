package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("shravan");
		
		driver.findElement(By.name("lastname")).sendKeys("25112016");
		
		driver.findElement(By.name("reg_email__")).sendKeys("thaikillavi1985@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("thaikillavi1985@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("navarhs");
		
		driver.findElement(By.name("birthday_day")).sendKeys("25");
		
		driver.findElement(By.xpath("//option[text()='25']")).click();
		
		driver.findElement(By.name("birthday_month")).sendKeys("Nov");
		
		driver.findElement(By.xpath("//option[text()='Nov']")).click();
		
		WebElement birthyear= driver.findElement(By.name("birthday_year"));
		
		
		Select year = new Select(birthyear);
		
		year.selectByValue("2016");
		
		
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		
		
		
		driver.findElement(By.name("websubmit")).click();
		
		
		

	}

}

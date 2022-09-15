package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver facebook=new ChromeDriver();
		facebook.get("https://en-gb.facebook.com");
		facebook.manage().window().maximize();
		facebook.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		facebook.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		facebook.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Janani");
		facebook.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vijayakumar");
		facebook.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("jananiv39@g.mail.com");		
	    facebook.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("jananiv39@g.mail.com");
	  	facebook.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Jananivj");	
	  	WebElement birth = facebook.findElement(By.xpath("//select[@name='birthday_day']"));
	  	Select date =new Select(birth);
	  	date.selectByValue("19");
	  	
	    WebElement birthmonth = facebook.findElement(By.xpath("//select[@name='birthday_month']"));
	    Select month=new Select(birthmonth);
	    month.selectByVisibleText("Sep");
	  
	   WebElement birthyear = facebook.findElement(By.xpath("//select[@id='year']"));
	   Select year=new Select(birthyear);
	   year.selectByIndex(15);
	   
	   facebook.findElement(By.xpath("//label[text()='Female']")).click();
	   facebook.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}

package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();//to maximize the page
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//password
		driver.findElement(By.className("decorativeSubmit")).click();//login button
     	driver.findElement(By.id("label")).click();//CRM/SFA link
		driver.findElement(By.linkText("Leads")).click();//click lead
		driver.findElement(By.linkText("Create Lead")).click();//click create lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");//click create lead
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");//click 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vijayakumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("JN");//click 
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("this is code to create duplicate lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jananiv98@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("JA");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jan");
		driver.findElement(By.id("createLeadForm_lastName")).clear();
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("jan");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);

	}

}

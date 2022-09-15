package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver editlead=new ChromeDriver();
		editlead.get("http://leaftaps.com/opentaps/control/main");
		editlead.manage().window().maximize();
		editlead.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		editlead.findElement(By.id("username")).sendKeys("DemoCSR");
		editlead.findElement(By.id("password")).sendKeys("crmsfa");
		editlead.findElement(By.className("decorativeSubmit")).click();
		editlead.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();
		
		editlead.findElement(By.linkText("Leads")).click();
		editlead.findElement(By.xpath("//a[text()='Find Leads']")).click();
		 
	    editlead.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Janani");
		editlead.findElement(By.xpath("(//td[@class='x-btn-center'])[6]")).click();
		editlead.findElement(By.xpath("//a[text()='10154']")).click();
		//String title = editlead.getTitle();
     	//	System.out.println(title);
		
		editlead.findElement(By.xpath("//a[text()='Edit']")).click();
		editlead.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		editlead.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("ABC");
		editlead.findElement(By.xpath("//input[@name='submitButton']")).click();
		editlead.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).equals("ABC");
		editlead.close();
		
		
		
		
		
		
		

	}

}

package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver deletelead=new ChromeDriver();
		deletelead.get("http://leaftaps.com/opentaps/control/main");
		deletelead.manage().window().maximize();
		deletelead.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		deletelead.findElement(By.id("username")).sendKeys("DemoCSR");
		deletelead.findElement(By.id("password")).sendKeys("crmsfa");
		deletelead.findElement(By.className("decorativeSubmit")).click();
        deletelead.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();
		
		deletelead.findElement(By.linkText("Leads")).click();
		
		deletelead.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		deletelead.findElement(By.xpath("//span[text()='Phone']")).click();
		deletelead.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7598638157");
		deletelead.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    deletelead.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//System.out.println(text);
		//deletelead.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10357']")).click();
		deletelead.findElement(By.xpath("//a[text()='Delete']")).click();
		//deletelead.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		//deletelead.findElement(By.xpath("//a[text()='Delete']")).click();
		deletelead.findElement(By.xpath("//a[text()='Find Leads']")).click();
		deletelead.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		deletelead.findElement(By.xpath("//button[text()='Find Leads']")).click();
	//	String noRec = deletelead.findElement(By.xpath("//div[text()='No records to display']")).getText();
	//	System.out.println(noRec);
		
		
		
		
	//	deletelead.findElement(By.)).click();
	//	deletelead.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7598638157");
		//deletelead.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//System.out.println("No records to display");
		deletelead.close();
		
			

	}

}

package week4.day1.assignment;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittargorh {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.chittorgarh.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
        driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
        List<String> lst=new ArrayList<String>();
        for (int i = 0; i < lst.size(); i++) {
        	
        	List<WebElement> secName = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered')]//tr["+i+"]/td[3]"));
        	String name= secName.get(i).getText();
        	System.out.println(name);
        
        for (int j = 0; j < lst.size(); j++) {
        	
        	lst.add(name);
        }	
		}
        
        Set<String> dupName=new LinkedHashSet<String>(lst);
             
			if(lst.size()==dupName.size()) {
				System.out.println("Dupicate is present");
		}
             else {
            	 System.out.println("No Dupilcate");
             }
        
             }
	
}

package week4.day1.assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HerokuApp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testleaf.herokuapp.com/pages/table.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       List<WebElement> findElement = driver.findElements(By.xpath("//table[@cellspacing='0']"));
       List<WebElement> rows = driver.findElements(By.xpath("//table[@cellspacing='0']//tr"));
       System.out.println("Row size=" +rows.size());
       List<WebElement> coloumns = driver.findElements(By.xpath("//table[@cellspacing='0']//th"));
       System.out.println("coloumns size=" +coloumns.size()); 
       List<WebElement> progress = driver.findElements(By.xpath("//tr[@class='even']//td[2]"));
      for (int i = 0; i < progress.size(); i++) {
    	  String text = progress.get(i).getText();
    	  System.out.println(text);
		
	}
driver.findElement(By.xpath("(//input[@name='vital'])[3]")).click();
	}

}

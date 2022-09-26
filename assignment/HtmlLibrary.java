package week4.day1.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlLibrary {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://html.com/tags/table/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> absolute = driver.findElements(By.xpath("//div[@class='render']/table//tr[2]"));
         for (int i = 0;i> absolute.size(); i++) {
	      String text = absolute.get(i).getText();
	      System.out.println(text);
}
	}

}

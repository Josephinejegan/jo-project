package Drop.Task.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask7 {
	
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\ws_java_ex\\Seleniumex\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		//print all options without using select class(months)
		//we can use actions class to get the text
		
		WebElement createBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createBtn.click();
		Thread.sleep(3000);
		WebElement dayOption = driver.findElement(By.id("day"));
		WebElement monthOption = driver.findElement(By.id("month"));
		WebElement yearBtn = driver.findElement(By.id("year"));
		
		Actions actions=new Actions(driver);
		actions.contextClick().perform();
		
			String data = dayOption.getText();
			System.out.println(data);
			String data1 = monthOption.getText();
			System.out.println(data1);
			
			String data2 = yearBtn.getText();
			System.out.println(data2);
			
				
}
				
}




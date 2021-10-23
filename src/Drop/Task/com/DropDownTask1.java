package Drop.Task.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask1 {
	
		public static void main(String[] args) throws InterruptedException {
	
			
			System.setProperty("webdriver.chrome.driver", "D:\\ws_java_ex\\Seleniumex\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			//print all text options(years)
			
			WebElement createBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
			createBtn.click();
			Thread.sleep(3000);
			WebElement yearBtn = driver.findElement(By.id("year"));
			Select select=new Select(yearBtn);
			List<WebElement> options = select.getOptions();
			int size = options.size();
			System.out.println(size);
			for(int i=0;i<options.size();i++)	
			{
				WebElement w = options.get(i);
				String text = w.getText();
				System.out.println(text);
			}
			
}
}

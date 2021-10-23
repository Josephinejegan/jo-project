package Drop.Task.com;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask10 {
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\ws_java_ex\\Seleniumex\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		//print last 5 options text(months)
		
		WebElement createBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createBtn.click();
		Thread.sleep(3000);
		WebElement dayOption = driver.findElement(By.id("year"));
		Select select=new Select(dayOption);
		List<WebElement> options = select.getOptions();
		Set<WebElement>l=new LinkedHashSet<>();
		l.addAll(options);
		if (options.size()==l.size()) {
			System.out.println("No duplicate in year");
			
		}
		else {
			
System.out.println("duplicate in year");
		}
}



}

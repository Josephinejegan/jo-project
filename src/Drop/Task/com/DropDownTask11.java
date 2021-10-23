package Drop.Task.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask11 {
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\ws_java_ex\\Seleniumex\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	    driver.manage().window().maximize();                                                                         
		
		WebElement createBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createBtn.click();
		Thread.sleep(3000);
		WebElement dayOption = driver.findElement(By.xpath("//select[@id='month']"));
		Select select=new Select(dayOption);
		List<WebElement> options = select.getOptions();
	select.selectByIndex(options.size()-1);
		
}}




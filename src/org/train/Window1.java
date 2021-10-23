package org.train;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ws_java_ex\\Seleniumex\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtBoxSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtBoxSearch.sendKeys("iphone",Keys.ENTER);
		WebElement iphoneClick = driver.findElement(By.xpath("//img[@alt='Apple iPhone 11 (64GB) - Purple']"));
		
		iphoneClick.click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		for (String eachWindow:allWindow ) {
			
		
		
			if(!parentWindow.equals(eachWindow))
			{
				driver.switchTo().window(eachWindow);
			}
			
		}
		
	WebElement addToCartbtn = driver.findElement(By.id("add-to-cart-button"));	
	addToCartbtn.click();
}
}

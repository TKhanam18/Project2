package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_practice {

	public static void main(String[] args) throws InterruptedException {
		//set up chromedriver set up
		WebDriverManager.chromedriver().setup();
		//create an object and instantiate
		WebDriver driver = new ChromeDriver(); 
		// Maximize window
				driver.manage().window().maximize();
			
				// get url
				driver.get("https://www.alibaba.com");
				//mousehover on ship to
				Thread.sleep(2000);
				WebElement element = driver.findElement(By.xpath("//span[text()='Ship to: ']"));
				Actions action = new Actions(driver);
				action.moveToElement(element).build().perform();
				Thread.sleep(3000);
				WebElement webelement2= driver.findElement(By.xpath("//input[@placeholder='Enter keyword to search.']"));
							
				String s =webelement2.getTagName();
				System.out.println(s);
				
				webelement2.sendKeys("China");
				
				
				Actions act2 = new Actions(driver);
					action.moveToElement(webelement2).clickAndHold();
					

			}
		

}



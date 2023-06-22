package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Choose_my_Location_mehedi {

	public static void main(String[] args) throws InterruptedException {
		// setup chromedriver setup
				WebDriverManager.chromedriver().setup();

				// create a object and instatntiate
				WebDriver driver = new ChromeDriver();

				// Maximize window
				driver.manage().window().maximize();

				// get url
				driver.get("https://www.alibaba.com");

				// mousehober on ship to
				Thread.sleep(2000);
				WebElement webelement = driver.findElement(By.xpath("//span[text()='Ship to: ']"));
				Actions act = new Actions(driver);
				act.moveToElement(webelement).build().perform();

				Thread.sleep(2000);

				// div[@class='input-container ship-to-country']

				//WebElement webelement2 = driver.findElement(By.xpath("//div[@class='input-container ship-to-country']"));
				
				
				webelement = driver.findElement(By.xpath("//div[@class=\"input-container ship-to-country\"]/div"));
				
				String s = webelement.getTagName();
				System.out.println(s);
				webelement.click();

				Thread.sleep(2000);
				driver.findElement(
						By.xpath("//div[@class=\"input-container ship-to-country\"]/div/div/div[2]/ul/li[2]/ul/li[1]")).click();

				driver.findElement(By.xpath("//input[@placeholder=\"Enter city or ZIP code\"]")).click();

				driver.findElement(By.xpath("//input[@placeholder=\"Enter city or ZIP code\"]")).sendKeys("Ghazni");

				Thread.sleep(2000);
				webelement = driver.findElement(By.xpath("//div[@class=\"header-ship-to-action-main\"]/button"));
				Thread.sleep(2000);

				System.out.println(webelement.getText());

				webelement.click();

				System.out.println("Done");
	
	}

}

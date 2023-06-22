package step_definition;

import javax.lang.model.element.Element;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Alibaba_logo_verification extends Base {
	@Given("I am on the landing page")
	public void i_am_on_the_landing_page() {
	  navigateURL(host); 
	}

	@Then("I verify the logo of the webpage")
	public void i_verify_the_logo_of_the_webpage() {
	String s = getElementText(By.xpath("//a[text()='Alibaba.com']"));
	
	Assert.assertEquals("Alibaba.com", s);//assertion for junit
	System.out.println("logo verified");
	}


}

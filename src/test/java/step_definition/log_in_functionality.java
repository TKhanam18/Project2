package step_definition;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class log_in_functionality extends Base{
	String userName;
	String pass;
	int rowNum;
	String errMsg;
	
	@Given("I am in the Alibaba Home page")
	public void i_am_in_the_Alibaba_Home_page() {
	    navigateURL(host);
	}

	@When("I Mouse Hovar in signin menu cart")
	public void i_Mouse_Hovar_in_signin_menu_cart() {
	    mousehover(By.xpath("//div[@class='sc-hd-right sc-hd-float-r']/div[1]/div[1]/div[1]/i[1]"));
	}

	@Then("I click in signin button")
	public void i_click_in_signin_button() {
	    click(By.xpath("//div[@class='sc-hd-right sc-hd-float-r']//div[@class='sc-hd-ms-btgroup']/a[1]"));
	}

	@Then("I enter the invalid email id from {int}")
	public void i_enter_the_invalid_email_id_from(Integer rowNum) {
		userName = testData.get(rowNum).get("userId");
	    sendkeys(By.id("fm-login-id"),userName);
	}

	@Then("I enter the invalid password")
	public void i_enter_the_invalid_password() {
		pass = testData.get(rowNum).get("password");
	    sendkeys(By.id("fm-login-password"),pass);
	
	}
	
	@Then("I click in submit button")
	public void i_click_in_submit_button() {
	    click(By.id("fm-login-submit"));
	}

	@Then("I verify the login error message")
	public void i_verify_the_login_error_message() {
		errMsg = testData.get(rowNum).get("errorMessage");
	    String actualMsg = getElementText(By.xpath("//div[@id='login-error']/span[2]"));
	    Assert.assertEquals(errMsg, actualMsg);
	    System.out.println("Verification done");
	}




}



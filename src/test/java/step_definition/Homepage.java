package step_definition;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage extends Base{
	@Given("I am in landing page")
	public void i_am_in_landing_page() {
	 navigateURL(host);   
	}
	@When("I input data into search box {int}")
	public void i_input_data_into_search_box(Integer rowNum) {
		String s= testData.get(rowNum).get("productname");
		sendkeys(By.xpath("//input[@class='search-bar-input']"), s);
		  System.out.println("Done");
	}


	@Then("I click the search icon")
	public void i_click_the_search_icon() {
	 click(By.xpath("//input[@class='search-bar-input']/following-sibling::button")); 
	}


	@When("I mouseHover on region setting")
	public void i_mouseHover_on_region_setting()  {
	mousehover(null);
	}

	@When("go back to mainpage")
	public void go_back_to_mainpage() {
	  
	}

	@When("I select languauge as Hindi")
	public void i_select_languauge_as_Hindi() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select currency as INR")
	public void i_select_currency_as_INR() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click save button")
	public void i_click_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	   
	    
	   
	}



}

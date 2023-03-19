package adactin.com.Stepdefination;

import org.junit.Assert;

import PageObjectManager.PageObjectManagar;
import adactin.com.Baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends Baseclass{
	
	PageObjectManagar obj=new PageObjectManagar(driver);
	
	@Given("User Launch the {string} Browser")
	public void user_launch_the_browser(String string) {
	   browserLaunch(string);
	   Window_max();
	}
	@Given("User Naviagte Url {string}")
	public void user_naviagte_url(String string) {
	   getUrl(string);
	}
	@Then("User verify login page")
	public void user_verify_login_page() {
		Assert.assertTrue(elementIsDisplayed(obj.getLoginPage().getAdactin_Logo()));
	}
	@Then("User Enter UserName {string}")
	public void user_enter_user_name(String string) {
elementSendKeys(obj.getLoginPage().Username, string);	    
	}
	@Then("User Enter Password {string}")
	public void user_enter_password(String string) {
elementSendKeys(obj.getLoginPage().Password, string);	    
	}
	@Then("User Click the login Button")
	public void user_click_the_login_button() {
	   elementClick(obj.getLoginPage().login_btn);
	}
	
	@Then("User Verify login Sucessfull")
	public void user_verify_login_sucessfull() {
		Assert.assertTrue(elementIsDisplayed(obj.getHomePage().profileName));;
	  // Assert.assertTrue(elementIsDisplayed(obj.getHomePage().profileName));
	}
	@Then("User Verify Error message {string}")
	public void user_verify_error_message(String string) {
	    Assert.assertEquals(string, getText(obj.getLoginPage().login_error_msg));
	}
}

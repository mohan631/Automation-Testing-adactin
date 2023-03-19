package Stepdefinition;

import org.junit.*;

import Baseclass.Baseclass;
import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Steps extends Baseclass{

	

@Given("^User launch the \"([^\"]*)\" Browser$")
public void user_launch_the_Browser(String arg1) throws Throwable {
 // Browserlaunch(ReadProperty().get(arg1));
	Browserlaunch();
}

@Given("^User Navigate the Url \"([^\"]*)\"$")
public void user_Navigate_the_Url(String arg1) throws Throwable {
   getUrl(ReadProperty().get(arg1));
}
PageObjectManager obj=new PageObjectManager(driver);
@Then("^User verify login page$")
public void user_verify_login_page() throws Throwable {
   Assert.assertTrue(elementIsdispalyed(obj.getLoginPage().Adaction_logo));
}

@Then("^User Enter valid UserName \"([^\"]*)\"$")
public void user_Enter_valid_UserName(String arg1) throws Throwable {
elementSendKeys(obj.getLoginPage().Username, ReadProperty().get(arg1));    
}

@Then("^User Enter Valid Password \"([^\"]*)\"$")
public void user_Enter_Valid_Password(String arg1) throws Throwable {
elementSendKeys(obj.getLoginPage().Password, ReadProperty().get(arg1));    
}

@Then("^User click the login Button$")
public void user_click_the_login_Button() throws Throwable {
   elementClick(obj.getLoginPage().Login_btn);
    
}

@Then("^User Verify logined Successfully$")
public void user_Verify_logined_Successfully() throws Throwable {
    Assert.assertTrue(elementIsdispalyed(obj.getSearchPage().Profile_name));
}
@Then("^User Enter Username \"([^\"]*)\" and Enter Password \"([^\"]*)\"$")
public void user_Enter_Username_and_Enter_Password(String username, String password) throws Throwable {
   elementSendKeys(obj.getLoginPage().Username, username);
   elementSendKeys(obj.getLoginPage().Password, password);
}

@Then("^User Verify login Error Message$")
public void user_Verify_login_Error_Message() throws Throwable {
   // Assert.assertTrue(elementIsdispalyed(obj.getLoginPage().LoginError));
}


}

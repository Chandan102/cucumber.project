package stepDefinition;

import org.junit.runner.RunWith;

import TrakZues_Base.base;
import TrakZues_data.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdefinition extends base{

    @Given("^Initilize the brower with chrome$")
    public void initilize_the_brower_with_chrome() throws Throwable {
        initializedriver();
    }

    @When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" to login$")
    public void user_enters_username_as_something_and_password_as_something_to_login(String strArg1, String strArg2) throws Throwable {
        loginpage l = new loginpage(driver);
        Thread.sleep(3000);
        l.username().sendKeys(strArg1);
		l.password().sendKeys(strArg2);
		l.checkbox().click();
		// l.verify().click();
		l.loginbutton().click();
		Thread.sleep(3000);
    }

    @Then("^verify whether user is able to login and Dashboard page to be opened$")
    public void verify_whether_user_is_able_to_login_and_dashboard_page_to_be_opened() throws Throwable {
        //
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        driver.get(strArg1);
    }

}

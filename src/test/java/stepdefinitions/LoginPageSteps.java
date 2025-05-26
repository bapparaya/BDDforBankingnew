package stepdefinitions;

import Base.BaseClass;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass {
    LoginPage loginpage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        initialize("chrome");
        loginpage = new LoginPage();
    }
    @When("the user enters valid username {string} and password {string}")
    public void the_user_enters_valid_username_and_password(String username, String password) {
      loginpage.verifylogin(username,password);
    }
    @When("clicks the login button")
    public void clicks_the_login_button() {
       loginpage.clickonLogin();
    }
    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
       System.out.println(driver.getTitle());
    }
}

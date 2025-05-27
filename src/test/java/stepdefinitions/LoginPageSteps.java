package stepdefinitions;

import Base.BaseClass;
import Pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

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

    @Then("login should fail and user should remain on the login page")
    public void login_should_fail_and_user_should_remain_on_the_login_page() {
        System.out.println(driver.getTitle());
    }



    @Then("the following ATM services should be displayed:")
    public void the_following_atm_services_should_be_displayed(DataTable dataTable) {
        List<String> services = dataTable.asList();
        System.out.println(services);
        List<String> acservice = loginpage.atmserivcesdisplayed();
        Assert.assertEquals(acservice, services);
    }
}

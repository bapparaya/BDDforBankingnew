package Pages;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

@FindBy(xpath="//input[@name='username']")
WebElement username;

@FindBy(xpath = "//input[@name='password']")
WebElement password;

@FindBy(xpath = "//input[@type='submit']")
WebElement loginbtn;

public LoginPage(){
    super();
    PageFactory.initElements(driver,this);
}

public void verifylogin(String username, String password){
    this.username.sendKeys(username);
    this.password.sendKeys(password);

}

public void clickonLogin(){
    loginbtn.click();
}














}

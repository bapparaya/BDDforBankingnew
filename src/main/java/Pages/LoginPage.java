package Pages;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BaseClass {

@FindBy(xpath="//input[@name='username']")
WebElement username;

@FindBy(xpath = "//input[@name='password']")
WebElement password;

@FindBy(xpath = "//input[@type='submit']")
WebElement loginbtn;

@FindBy(xpath="//ul[@class= \"services\"]/li/a")
List<WebElement> services;

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


public List<String> atmserivcesdisplayed(){
    List<String> serv = new ArrayList<>();
    for(WebElement ele:services){
        serv.add(ele.getText());
        System.out.println(ele.getText());
    }
    return serv;
}














}

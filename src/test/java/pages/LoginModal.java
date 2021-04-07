package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTxtBox= new TextBox(By.id("email"),"email TxtBox in Login Modal");
    public TextBox pwdTxtBox= new TextBox(By.id("password"),"pwd TxtBox in Login Modal");
    public Button loginButton= new Button(By.xpath("//*[@id=\"login_form\"]/button"),"login Button in Login Modal");

    public LoginModal(){}

}

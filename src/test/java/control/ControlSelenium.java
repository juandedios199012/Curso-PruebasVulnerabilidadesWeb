package control;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class ControlSelenium {

    protected WebElement control;
    protected By locator;
    protected String nameControl;

    public ControlSelenium(By locator,String nameControl){
        this.locator=locator;
        this.nameControl= nameControl;
    }

    protected void find(){
        this.control= Session.getInstance().getDriver().findElement(this.locator);
    }

    @Step("{0}")
    public void stepLoggerAllure(String action){}


    public void click(){
        this.stepLoggerAllure("Click on "+this.nameControl);
        this.find();
        this.control.click();
    }

    public String getText(){
        this.stepLoggerAllure("Get text from "+this.nameControl);
        this.find();
        return this.control.getText();
    }

    public boolean isControlDisplayed(){
        try {
            this.stepLoggerAllure("Is control "+this.nameControl+ " displayed?");
            this.find();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }

    }

}





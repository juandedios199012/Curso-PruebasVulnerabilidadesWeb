
package control;

import org.openqa.selenium.By;

public class TextBox extends ControlSelenium {

    public TextBox(By locator, String nameControl) {
        super(locator, nameControl);
    }

    public void set (String value){
        this.stepLoggerAllure("Fill "+this.nameControl+" with the value: "+value);
        this.find();
        this.control.sendKeys(value);
    }
}

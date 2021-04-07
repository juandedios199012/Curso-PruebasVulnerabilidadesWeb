
package pages;

import control.Button;
import org.openqa.selenium.By;

public class ProjectPage {
    public Button logoutButton = new Button(By.xpath("//*[@id=\"top_bar_inner\"]/div[2]/button[5]/img"),"logout Button on Project Page Menu");
    public ProjectPage(){}
}

package pages;

import control.Label;
import org.openqa.selenium.By;

public class MainPage {
    public Label loginLabel = new Label(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/header/nav/div/ul[2]/li[1]/a"),"login Label on MainPage");
    public MainPage(){}

}
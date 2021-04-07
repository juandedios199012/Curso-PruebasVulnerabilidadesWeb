package cleanTest;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginModal;
import pages.MainPage;
import pages.ProjectPage;
import session.Session;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import static commons.Configurations.hostUT;

public class LoginTest {

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    ProjectPage projectPage= new ProjectPage();
    @Before
    public void before(){
        Session.getInstance().getDriver().get(hostUT);
    }

    @Test
    @DisplayName("001 Verify the login is woring using email and pwd")
    @Description("This test case is to verify the login is working when having an correct email format and correct pwd")
    @Epic("Security Authentication")
    @Feature("Login")
    @Link("www.jira.com/TC245698")
    @Issue("BUG00001")
    @Severity(SeverityLevel.BLOCKER)
    public void verifyLoginOnPage() {

        mainPage.loginLabel.click();
        loginModal.emailTxtBox.set("cursos.jbs.learn@gmail.com");
        loginModal.pwdTxtBox.set("12345678");
        loginModal.loginButton.click();

        Assert.assertTrue("ERROR no inicio sesion",projectPage.logoutButton.isControlDisplayed());
    }

    @After
    public void after(){
        Session.getInstance().closeSession();
    }
}

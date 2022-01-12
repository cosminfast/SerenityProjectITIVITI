package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;

public class LoginSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToLoginPage(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void enterCredentials(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void checkUserIsLoggedIn(String userName){
        myAccountPage.checkUserIsLoggedIn(userName);
    }

    @Step
    public void doLogin(String email, String pass, String userName){

        navigateToLoginPage();
        enterCredentials(email, pass);
        clickLoginButton();
        checkUserIsLoggedIn(userName);
    }

}

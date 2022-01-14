package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class LoginSteps extends BaseSteps {



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

package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS);
        loginSteps.clickLoginButton();
        loginSteps.checkUserIsLoggedIn(EnvConstants.USER_NAME);
    }

}

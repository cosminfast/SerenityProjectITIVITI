package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CompareTest extends BaseTest{

    @Test
    public void compareProductsTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS, EnvConstants.USER_NAME);
        searchSteps.searchForKeyword("a");
        compareSteps.clickCompare();
        compareSteps.checkIsOnComparePage();
        searchSteps.searchForKeyword("a");
    }
}

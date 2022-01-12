package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest{


    @Test
    public void addToCartTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS, EnvConstants.USER_NAME);
        searchSteps.findElementInList("");
        searchSteps.addFoundProductInCart();
    }
}

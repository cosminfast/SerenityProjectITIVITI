package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{


    @Test
    public void validCheckoutTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS, EnvConstants.USER_NAME);
        searchSteps.addProductToCart("SILVER DESERT NECKLACE");

    }
}

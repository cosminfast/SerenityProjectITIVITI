package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest{


    @Test
    public void addToCartTest(){
        String product = "SILVER DESERT NECKLACE";

//        loginSteps.doLogin(EnvConstants.USER_EMAIL,EnvConstants.USER_PASS, EnvConstants.USER_NAME);
        searchSteps.searchForKeyword(product);
        searchSteps.findElementInList(product);
        searchSteps.addFoundProductInCart();
        cartSteps.updateQuantityForProduct(2, product);

    }
}

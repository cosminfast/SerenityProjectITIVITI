package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class CartSteps extends BaseSteps{


    @Step
    public void updateQuantityForProduct(int qty, String product){
        cartPage.setQtyToProduct(qty,product);
    }

}

package org.fasttrackit.steps;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class CompareSteps extends BaseSteps{

    @Step
    public void clickCompare(){
        widgetsPage.clickOnCompareButton();
    }

    @Step
    public void checkIsOnComparePage(){
        Assert.assertTrue(compareProductsPage.isPrintDisplayed());
    }
}

package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HeaderMenuSteps extends BaseSteps {

    @Step
    public void moveToCategory(String categoryName) {
        Assert.assertTrue("Category with name " + categoryName + " not found!", homePage.hoverOverCategory(categoryName));
    }

    @Step
    public void clickOnSubcategory(String subCategoryName){
        Assert.assertTrue("Subcategory name " + subCategoryName + " not found!", homePage.clickOnSubcategory(subCategoryName));
    }

    @Step
    public void scrollToElement(){
        homePage.scrollToCopyright();


    }
}

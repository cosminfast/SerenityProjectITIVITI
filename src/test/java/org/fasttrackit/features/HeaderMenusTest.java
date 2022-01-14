package org.fasttrackit.features;

import org.junit.Test;

public class HeaderMenusTest extends BaseTest{


    @Test
    public void selectCategoryAndSubCategory(){
//        headerMenuSteps.moveToCategory("Sale");
//        headerMenuSteps.clickOnSubcategory("Men");

        headerMenuSteps.moveToCategory("Home & Decor");
        headerMenuSteps.clickOnSubcategory("Bed & Bath");
    }

    @Test
    public void scrollTest(){
        headerMenuSteps.scrollToElement();
    }
}

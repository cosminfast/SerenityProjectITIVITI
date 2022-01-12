package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade helloMessageSection;

    public void checkUserIsLoggedIn(String userName){
        helloMessageSection.shouldContainOnlyText("Hello, "+userName+"!");
    }

}

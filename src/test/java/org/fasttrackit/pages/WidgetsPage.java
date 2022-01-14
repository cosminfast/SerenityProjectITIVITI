package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class WidgetsPage extends BasePage{

    @FindBy(css = "[title='Compare']")
    private WebElementFacade compareButton;

    public void clickOnCompareButton(){
        clickOn(compareButton);
    }
}

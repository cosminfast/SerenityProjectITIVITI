package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class CompareProductsPage extends BasePage{

    @FindBy(css = ".link-print")
    private WebElementFacade printLink;




    public boolean isPrintDisplayed(){
        switchToNewWindow();
        boolean x = printLink.isPresent();
        getDriver().close();
        switchToMainWindow();
        return x;
    }
}

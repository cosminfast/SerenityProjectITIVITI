package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passwordField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    public void setEmailField(String email) {
        waitFor(emailField);
        typeInto(emailField, email);
    }

    public void setPasswordField(String pass) {
        typeInto(passwordField, pass);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }


}

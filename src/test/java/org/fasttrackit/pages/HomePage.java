package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Set;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;

    @FindBy(css = ".level0 > a")
    private List<WebElementFacade> listOfCategories;

    @FindBy(css = ".level0.menu-active ul a")
    private List<WebElementFacade> listOfSubCategories;

    @FindBy(css = ".copyright")
    private WebElementFacade copyrightElement;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String value) {
        typeInto(searchField, value);
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public boolean hoverOverCategory(String category){
        for (WebElementFacade elementFacade : listOfCategories){
            if(elementFacade.getText().equalsIgnoreCase(category)){
                withAction().moveToElement(elementFacade).perform();
                return true;
            }
        }
        return false;
    }

    public boolean clickOnSubcategory(String subcategory){
        waitFor(listOfCategories.get(0));
        for (WebElementFacade webElementFacade : listOfSubCategories){
            if (webElementFacade.getText().equalsIgnoreCase(subcategory)){
                webElementFacade.click();
                return true;
            }
        }
        return false;
    }

    public void scrollToCopyright(){
        scrollToElement(copyrightElement);

    }
}

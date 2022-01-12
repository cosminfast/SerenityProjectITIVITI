package org.fasttrackit.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResutsPage;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {

    private HomePage homePage;
    private SearchResutsPage searchResutsPage;
    private WebElementFacade foundElement;

    @Step
    public void searchForKeyword(String keyword) {
        homePage.setSearchField(keyword);
        homePage.clickSearchButton();
    }

    @Step
    public void findElementInList(String productName) {
        foundElement = (searchResutsPage.getProductFromList(productName));
        Assert.assertNotNull("Product '"+productName+"' was not found in the search results!",foundElement);
    }

    @Step
    public void checkProductIsNotInList(String productName){
        foundElement = (searchResutsPage.getProductFromList(productName));
        Assert.assertNull("Product '"+productName+"' was found in the search results!",foundElement);

    }

    @Step
    public void openSearchedProduct(){
        searchResutsPage.openSearchedElement(foundElement);
    }

    @Step
    public void addFoundProductInCart(){
        searchResutsPage.addProductToCart(foundElement);
    }
    @Step
    public void addProductToCart(String productName){
        searchForKeyword(productName);
        findElementInList(productName);
        addFoundProductInCart();
    }

}

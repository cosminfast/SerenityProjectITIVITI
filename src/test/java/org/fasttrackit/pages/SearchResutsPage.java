package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResutsPage extends PageObject {

    @FindBy(css = ".products-grid .item")
    private List<WebElementFacade> listOfProducts;


    public WebElementFacade getProductFromList(String productName){
        for (WebElementFacade elementFacade : listOfProducts) {
            if (elementFacade.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(productName)){
                return elementFacade;
            }
        }
        return null;
    }

    public void openSearchedElement(WebElementFacade elementFacade){
        waitFor(elementFacade);
        elementFacade.findElement(By.cssSelector("a")).click();
    }

    public void addProductToCart(WebElementFacade elementFacade){
        waitFor(elementFacade);
        elementFacade.findElement(By.cssSelector(".btn-cart")).click();
    }
}

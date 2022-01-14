package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class CartPage extends BasePage {


    @FindBy(css = "#shopping-cart-table tbody tr")
    private List<WebElementFacade> listOfProducts;


    private By qtyField = By.cssSelector("[title='Qty']");
    private By updateButton = By.cssSelector("[title='Update']");


    public boolean setQtyToProduct(int qty, String product) {
        for (WebElementFacade element : listOfProducts) {
            if (element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(product)) {
                element.findElement(qtyField).clear();
                element.findElement(qtyField).sendKeys(2 + "");
                element.findElement(updateButton).click();
                waitABit(1500);
                return true;
            }
        }
        return false;
    }
}

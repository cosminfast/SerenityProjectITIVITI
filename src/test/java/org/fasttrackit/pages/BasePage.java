package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class BasePage extends PageObject {

    private String currentWindow;

    public void scrollToElement(WebElement element){
        evaluateJavascript("arguments[0].scrollIntoView();",element);
    }

    public void switchToNewWindow(){
        currentWindow = getDriver().getWindowHandle();
        System.out.println(currentWindow);
        Set<String> allHandles = getDriver().getWindowHandles();
        for (String handle : allHandles){
            if (!handle.contentEquals(currentWindow)){
                getDriver().switchTo().window(handle);
                break;
            }
        }
    }

    public void switchToMainWindow(){
        getDriver().switchTo().window(currentWindow);
    }

}

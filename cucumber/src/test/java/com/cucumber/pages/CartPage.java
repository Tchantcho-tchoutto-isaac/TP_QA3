package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removeButton;
    
    @FindBy(className = "shopping_cart_badge")
    private WebElement cartBadge;

    @FindBy(id = "checkout")
    private WebElement checkoutbutonelement ;

    public CartPage(WebDriver webDriver ) {
        PageFactory.initElements(webDriver, this);
    }

    public void removeProductFromCart() {
        removeButton.click();
    }

    public boolean isCartEmpty() {
        try {
            return !cartBadge.isDisplayed();
        } catch (Exception e) {
            return false; // Le panier est vide si le badge n'est pas affiché
        }
        
    }

    public void clickcheckoutbuton(){
        checkoutbutonelement.click();
    }
}

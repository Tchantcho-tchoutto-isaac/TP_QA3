package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ProductsPage {

    private WebDriver webDriver;
 
   @FindBy(id = "add-to-cart-sauce-labs-backpack")  // ID du bouton pour ajouter au panier
   private WebElement addButtonElement;
   @FindBy(className = "shopping_cart_badge")  // Classname de l'icône du panier
   private WebElement cartBadgeElement;
   @FindBy(className = ".btn.btn_secondary.btn_small.cart_button")
   private WebElement removeButtonElement;
   @FindBy(id = "react-burger-menu-btn")
   private WebElement menuburgerelement ;
   @FindBy (id = "logout_sidebar_link")
   private WebElement logoutbuttoElement ;
   
   public ProductsPage(WebDriver webDriver){
       PageFactory.initElements(webDriver, this);
   }
    // action sur la page cart 

    public void addproduit(){
        addButtonElement.click();
    }
      // Vérifier que le bouton a changé pour "Remove"
      public String getAddButtonText() {
        return addButtonElement.getText();
    }
    public void checkpanier(){
        cartBadgeElement.click();
    }

    // Vérifier que l'icône du panier affiche le nombre d'articles ajoutés
    public String getCartItemCount() {
        return cartBadgeElement.getText();
    }
    public void removeButtonElement (){
        removeButtonElement.click();
    }

    public void menuburgerclick(){
        menuburgerelement.click();
    }

    
    public void logout() {
       
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement logoutBtn = wait.until(ExpectedConditions.elementToBeClickable(logoutbuttoElement));
    
        // Cliquer sur le bouton de déconnexion
        logoutBtn.click();
    }
    
}

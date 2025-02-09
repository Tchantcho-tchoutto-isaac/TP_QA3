package com.cucumber.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cucumber.pages.CartPage;
import com.cucumber.pages.LoginPage;
import com.cucumber.pages.ProductsPage;
import com.cucumber.tools.WebdriverTool;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductSteps {
    private ProductsPage productsPage;
    private LoginPage loginPage;
    private  CartPage cartPage;

   
 
   
    @Given("je suis sur la page des produits {string}")
    public void je_suis_sur_la_page_des_produits(String s) {
        // Write code here that turns the phrase above into concrete actions
        WebdriverTool.getDriver().get(s); // Assurez-vous d'utiliser l'URL correcte
        this.productsPage = new ProductsPage(WebdriverTool.getDriver());
    }

    
    @Then("je clique sur Add to Cart")
    public void je_clique_sur_Add_to_Cart() {
        productsPage.addproduit();
    }



    @Given("le nombre d articles dans le panier est {string}")
    public void le_nombre_d_articles_dans_le_panier_est(String s) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(s, productsPage.getCartItemCount());
    }

    @Given("je clique sur checkpanier")
    public void je_clique_sur_checkpanier() {
       productsPage.checkpanier();
    }
   

    @Given("je clique sur removeProduct")
    public void je_clique_sur_removeProduct() {
       cartPage.removeProductFromCart();
       
    }

    

    @Given("le panier devrais etre vide")
    public void le_panier_devrais_etre_vide() {

        assertTrue(!cartPage.isCartEmpty(), "Le panier devrait être vide."); 
    }
    

    @Given("je suis sur la page du panier {string}")
    public void je_suis_sur_la_page_du_panier(String s) {
       // Write code here that turns the phrase above into concrete actions
       WebdriverTool.getDriver().get(s); // Assurez-vous d'utiliser l'URL correcte
       this.cartPage = new CartPage(WebdriverTool.getDriver());
    }

   
  

   

}

package com.cucumber.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cucumber.pages.LoginPage;
import com.cucumber.pages.ProductsPage;
import com.cucumber.tools.WebdriverTool;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutSteps {
private ProductsPage productsPage;
private LoginPage loginPage;




    @When("je clique sur le menu burger")
    public void je_clique_sur_le_menu_burger() {
       productsPage = new ProductsPage(WebdriverTool.getDriver());
       productsPage.menuburgerclick();
    }

    @When("je clique sur le bouton de déconnexion")
    public void je_clique_sur_le_bouton_de_d_connexion() {
        productsPage.logout();
        // Write code here that turns the phrase above into concrete actions
    }

  
    @Then("l utilisateur doit être redirigé vers la page de connexion {string}")
    public void l_utilisateur_doit_tre_redirig_vers_la_page_de_connexion(String s) {
        assertTrue(WebdriverTool.getDriver().getCurrentUrl().equals(s), 
                "L'utilisateur n'a pas été redirigé vers la page de connexion.");
        
    }

    

}

package com.cucumber.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cucumber.pages.CartPage;
import com.cucumber.pages.CheckoutOnetpage;
import com.cucumber.pages.Checkouttwopage;
import com.cucumber.pages.LoginPage;
import com.cucumber.pages.ProductsPage;
import com.cucumber.tools.WebdriverTool;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {

    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutOnetpage checkoutOnetpage;
    private Checkouttwopage checkouttwopage ; 

    @Given("je suis connecté à la plateforme")
    public void je_suis_connecte_a_la_plateforme() {
        WebdriverTool.getDriver().get("https://www.saucedemo.com/");
        loginPage = new LoginPage(WebdriverTool.getDriver());
        loginPage.saisirUserName("standard_user");
        loginPage.saisirPassword("secret_sauce");
        loginPage.cliqueSurLogin();
    }

    @Given("je suis sur la page des produits")
    public void je_suis_sur_la_page_des_produits() {
        productsPage = new ProductsPage(WebdriverTool.getDriver());
    }

    @When("je clique sur le bouton Ajouter au panier")
    public void je_clique_sur_le_bouton_ajouter_au_panier() {
        productsPage.addproduit();
    }

    @Given("je vais à la page du panier")
    public void je_vais_a_la_page_du_panier() {
        cartPage = new CartPage(WebdriverTool.getDriver());
        productsPage.checkpanier();
    }

    @And("je clique sur le bouton de checkout")
    public void je_clique_sur_le_bouton_de_checkout() {
        cartPage.clickcheckoutbuton();
    }

    @And("je remplis le formulaire de commande avec le prénom {string}, le nom {string}, et le code postal {string}")
    public void je_remplis_le_formulaire_de_commande(String firstName, String lastName, String postalCode) {
        checkoutOnetpage =new CheckoutOnetpage(WebdriverTool.getDriver()) ;
        checkoutOnetpage.addfirstname(firstName);
        checkoutOnetpage.addlastname(lastName);
        checkoutOnetpage.addpostal(postalCode);
    }

    @And("je clique sur Continuer")
    public void je_clique_sur_continuer() {
        checkoutOnetpage.clickcontinue();
    }

    @And("je clique sur Finir")
    public void je_clique_sur_finir() {
        checkouttwopage= new Checkouttwopage(WebdriverTool.getDriver());
        checkouttwopage.clickfinish();
    }

    @Then("l'URL après soumission du formulaire de checkout doit contenir {string}")
    public void l_url_apres_soumission_du_formulaire_de_checkout_doit_contenir(String expectedUrl) {
        assertTrue(WebdriverTool.getDriver().getCurrentUrl().contains(expectedUrl),
            "L'URL après soumission du formulaire de checkout est incorrecte.");
    }
}

package com.cucumber.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cucumber.pages.LoginPage;
import com.cucumber.pages.ProductsPage;
import com.cucumber.tools.WebdriverTool;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    private LoginPage loginPage ;
    private ProductsPage productsPage; 
   
    @Given("je suis sur la page {string}")
    public void je_suis_sur_la_page(String s) {
        // Write code here that turns the phrase above into concrete actions
        WebdriverTool.getDriver().get(s);
        this.loginPage= new LoginPage(WebdriverTool.getDriver()); 
    }

    @When("je saisi le username {string}")
    public void je_saisi_le_username(String s) {
      loginPage.saisirUserName(s);
        // Write code here that turns the phrase above into concrete actions
    }

    @When("je saisi le password {string}")
    public void je_saisi_le_password(String s) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.saisirPassword(s);
    }

    @When("je clique sur Login")
    public void je_clique_sur_Login() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.cliqueSurLogin();
    }

    @Then("j accede mon dashboard")
    public void j_accede_mon_dashboard() {
        // Write code here that turns the phrase above into concrete actions
          assertTrue(true);
    }

    @Then("un message d erreur s affiche")
    public void un_message_d_erreur_s_affiche() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.getMessageErreur();
    }


    

}

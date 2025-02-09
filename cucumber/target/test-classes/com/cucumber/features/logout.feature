Feature: Déconnexion de l'utilisateur

  Background:
    Given je suis sur la page "https://www.saucedemo.com/"
    And je saisi le username "standard_user"
    And je saisi le password "secret_sauce"
    And je clique sur Login

  @logoutTest
  Scenario: Déconnexion de l'utilisateur
    Given  je suis sur la page des produits "https://www.saucedemo.com/inventory.html" 
    When je clique sur le menu burger
    And je clique sur le bouton de déconnexion
    Then l utilisateur doit être redirigé vers la page de connexion "https://www.saucedemo.com/"

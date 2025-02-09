Feature: Gestion des produits dans le panier

  Background:
    Given je suis sur la page "https://www.saucedemo.com/"
    And je saisi le username "standard_user"
    And je saisi le password "secret_sauce"
    And je clique sur Login

  @addProduct
  Scenario: Ajouter un produit au panier
    Given je suis sur la page des produits "https://www.saucedemo.com/inventory.html"
    When je clique sur Add to Cart
    Then le nombre d articles dans le panier est "1"

  @removeProduct
  Scenario: Supprimer un produit du panier
    Given je suis sur la page des produits "https://www.saucedemo.com/inventory.html"
    When je clique sur Add to Cart
    And je clique sur checkpanier
    Then je suis sur la page du panier "https://www.saucedemo.com/cart.html"
    When je clique sur removeProduct
    Then le panier devrais etre vide  



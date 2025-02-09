Feature: Login

  Background:
    Given je suis sur la page "https://www.saucedemo.com/"

  @positif
  Scenario: Login avec username correct et password correct en tant q adimi
    When je saisi le username "standard_user"
    And je saisi le password "secret_sauce"
    And je clique sur Login
    Then j accede mon dashboard

  @negatif
  Scenario: Login avec username incorrect et password correct en tant q adimi
    When je saisi le username "standard_user_incorrect"
    And je saisi le password "secret_sauce"
    And je clique sur Login
    Then un message d erreur s affiche

    
  @negatif
  Scenario: Login avec username correct et password incorrect en tant q adimi
    When je saisi le username "standard_user"
    And je saisi le password "secret_sauce_incorrect"
    And je clique sur Login
    Then un message d erreur s affiche

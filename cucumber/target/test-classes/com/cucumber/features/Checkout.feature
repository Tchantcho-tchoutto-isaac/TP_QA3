Feature: Checkout Process

@Checkout
  Scenario: Remplir le formulaire de commande et finir la commande
    Given je suis connecté à la plateforme
    And je suis sur la page des produits
    When je clique sur le bouton Ajouter au panier
    And je vais à la page du panier
    And je clique sur le bouton de checkout
    And je remplis le formulaire de commande avec le prénom "John", le nom "Doe", et le code postal "12345"
    And je clique sur Continuer
    And je clique sur Finir
    Then l'URL après soumission du formulaire de checkout doit contenir "checkout-complete.html"

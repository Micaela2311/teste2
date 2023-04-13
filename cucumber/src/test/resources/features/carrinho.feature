
Feature: Acessar carrinho de compras
  Como usuario quero acessar o carrinho de compras
  
  Scenario: 
    Given que acesse "https://www.saucedemo.com/"
    When acesso o campo carrinho
    And então clico no botão
  	Then valido o title "Swag Labs"

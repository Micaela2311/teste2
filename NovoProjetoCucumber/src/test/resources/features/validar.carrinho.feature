#Author: your.email@your.domain.com

@regressivo
Feature: Validar carrinho
Como usuario
Quero incluir produtos no carrinho
Para realizar compras

Background: login no site
Given que usuario esteja logado

  @tag1
  Scenario: Incluir produtos 
    Given que acesso o carrinho
    And e seleciono os produtos
    When acrecento no meu carrinho
   

 
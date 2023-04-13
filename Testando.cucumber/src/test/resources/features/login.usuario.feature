#Author: micaela.amorim@e2etreinamentos.com

@teste
Feature: Acessar login
Como usuario quero preencher os dados de acesso para realizar login

 
  Scenario: Login valido
    Given que esteja na tela de login
    And informo o user
    And informo a  senha 
    And e clico no botao login
    When clico no botao de login
    Then  valido login realizado
    

  

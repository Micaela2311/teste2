#micaela.amorim@e2etreinamentos.com.br

@regressivo
Feature: Login
  Como usuario 
  Quero realizar login
  Para comprar produtos

Background: login no site
  Given que desejo fazer login

 
  Scenario: Login
     When enviar dados validos
     Then usuario logado

   
|

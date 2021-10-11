# language: en

  Feature: Cadastro de usuário

    @cadastrarUsuario
    Scenario: Registrar um novo usuário
      Given que estou na tela de login
      And acesso o cadastro de usuário
      When eu preencho o formulário de cadastro
      And clico em registrar
      Then vejo cadastro realizado com sucesso
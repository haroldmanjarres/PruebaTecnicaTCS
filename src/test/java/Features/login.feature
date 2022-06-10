Feature: Login

  Como usuario deseo realizar el login de manera exitosa

  Scenario: Se ingresa al login desde el home de la pagina de store
    Given El usuario se encuentra en la pagina home de Store
    When  Hace click sobre el buttton Log in de la pagina home de Store
    When  Hace click en el campo de Username2
    When  Ingresa datos de Pruebaharold6
    When  Hace click en el campo de Password2
    When  Ingresa datos de 123
    When  Hace click sobre el buttton Log in
    Then  Ingresa al login con exito
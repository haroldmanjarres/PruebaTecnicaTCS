Feature: Registro

  Como usurio quiero registrarme de forma exitosa

  Scenario: Ingresar a el boton Sign up desde Home
    Given El usuario se encuentra en la pagina home de Store
    When  Hace click sobre el buttton Sign up de la pagina home de Store
    When  Hace click en el campo de Username
    When  Ingresa datos de usuario
    When  Hace click en el campo de Password
    When  Ingresa datos de Password
    When  Hace click sobre el buttton Sign up
    Then  Muestra mensaje emergente que se realizo con exito
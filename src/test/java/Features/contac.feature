Feature: Formulario de contacto

  Como usuario espero poder llenar el formulario de contacto correctamente

  Scenario: Ingresar a el boton Contact desde Home
    Given El usuario se encuentra en la pagina home de Store
    When  Hace click sobre el buttton Contact de la pagina home de Store
    When  Hace click en el campo Contact Email
    When  Ingresa datos en el campo Contact Email
    When  Ingresa datos en el campo Contact Name
    When  Hace click en el campoMessage
    When  Ingresa datos en el campo campoMessage
    When  Hace click sobre el buttton Send message
    Then  Muestra mensaje emergente que se realizo con exito
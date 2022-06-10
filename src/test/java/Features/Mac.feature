Feature: Agregar Mac

  Como usuario deseo poder agregar un Mac al carrito

  Scenario: Ingresar a la pagina store
    Given El usuario se encuentra en la pagina home de Store
    When  Hace click sobre el buttton Laptops de la pagina home de Store
    When  Hace click sobre el buttton MacBookPro de la pagina home de Store
    When  Hace click sobre el buttton Add to cart de la pagina home de Store
    Then  Muestra mensaje emergente que se realizo con exito
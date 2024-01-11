# Autor Felipe Rincon
Feature: compra_flores.com
  Como usuario de la pagina SANANGEL
  quiero agregar tres productos nuevos
  al carrito de compras con 2, 3 y 5 unidades
  respectivamente

  @Filtrar
  Scenario: Agregar 3 productos al carro de compras
    Given El usuario ingresa a la pagina SANANGEL
    When Realiza la seleccion de los productos
      | strcant1 | strcant2 | strcant3 |
      | 2        | 3        |5         |
    Then Se realiza la question de validacion
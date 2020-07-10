Feature: Compra de un producto

  Scenario Outline: Buscar y agregar productos al carrito
    When busco la siguiente palabra:
      | <Producto> |
    And selecciono el siguiente producto:
      | <ProductoEnStock> |
    And hago scroll para observar mas informacion y habilitar el boton de agregar a la bolsa
    And lo agrego a la bolsa
    Then valido en mi carrito que aparezca el producto seleccionado
      | <ProductoEnCarrito> |

    Examples:
      | Producto  | ProductoEnStock                                   | ProductoEnCarrito                           |
      | Televisor | Televisor LG 49 pulgadas LED 4K Ultra HD Smart TV | Televisor LG 49 pulgadas LED 4K Ultra HD... |
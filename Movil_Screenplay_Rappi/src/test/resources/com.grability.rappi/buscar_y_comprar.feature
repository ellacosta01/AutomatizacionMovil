Feature: Compra de una comida

  Scenario Outline: Buscar y agregar comida a la canasta
    When busco la siguiente palabra:
      | <Comida> |
    And selecciono la siguiente comida:
      | <ComidaEnStock> |
    And hago scroll para escoger la comida de interes y agregar los insumos del pedido
    And lo agrego a la bolsa
    Then valido en la canasta que aparezca la comida seleccionada
      | <ProductoEnLaCanasta> |

    Examples:
      | Comida | ComidaEnStock     | ProductoEnLaCanasta |
      | Arroz  | Arroz de Mariscos | Arroz de Mariscos   |
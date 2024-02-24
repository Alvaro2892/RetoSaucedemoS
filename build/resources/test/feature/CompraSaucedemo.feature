Feature: Compra de articulo en Saucedemo

    Como un usuario en la pagina de Saucedemo
    Yo quiero comprar un escoger un articulo y luego comprarlo
    Para verificar el correcto funcionamiento de la pagina


  Background:
    Given el usuario entra a la pagina de Saucedemo

  Scenario Outline: Compra de articulo en Saucedemo
    When escoge el articulo y luego se dirige al carrito de compra y realiza la compra
      | username      | password     |
      | <username>     |<password>     |
    Then el usuario deberia ver el siguiente mensaje de compra exitosa "Thank you for your order!"

    Examples:
      | username      | password     |

     ##@externaldata@./src/test/resources/Datadriven/Saucedemo.xlsx@Hoja2
   |standard_user   |secret_sauce|
   |standard_user   |secret_sauce|




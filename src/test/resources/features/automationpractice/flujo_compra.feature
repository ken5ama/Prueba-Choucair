Feature: Compras
En esta seccion el usuario puede hacer la compra 
  Scenario: Hacer la compra sin tener u usuario
    Given Que la pagina de automationpractice este abierta
     When el usuario da click sobre un producto
     And el usuario debe dar click en el boton Add to cart
     And el usuario debe dar click en el boton Proceed to checkout
     And el usuario debe dar click en el boton final Proceed to checkout
     And el usuario debe llenar el campo de Email address en la seccion CREATE AN ACCOUNT
     And el usuario debe dar click en el boton Create an acconunt
     And el usuario debe llenar los datos del formulario
     And el usuario debe dar click en el boton Register
     And el usuario debe dar click en el boton Proceed to checkout to ship
     And el usuario debe dar click en Terms of service
     And el usuario debe dar click en el boton Proceed to checkout to pay
     And el usuario debe seleccionar the Pay by bank wire order processing will be longer
     And el usuario debe dar click en el boton I confirm my order
     Then deberia aparecer Your order on My Store is complete
   Scenario: Hacer la compra con usuario
    Given Que la pagina de automationpractice este abierta
     When el usuario da click sobre un producto
     And el usuario debe dar click en el boton Add to cart
     And el usuario debe dar click en el boton Proceed to checkout
     And el usuario debe dar click en el boton final Proceed to checkout
     And el usuario debe llenar el campo de Email address en la seccion ALREADY REGISTERD?
     And el usuario debe llenar el campo de Password address en la seccion ALREADY REGISTERD?
     And el usuario debe dar click en el boton Sing in
     And el usuario debe dar click en el boton Proceed to checkout to ship
     And el usuario debe dar click en Terms of service
     And el usuario debe dar click en el boton Proceed to checkout to pay
     And el usuario debe seleccionar the Pay by bank wire order processing will be longer
     And el usuario debe dar click en el boton I confirm my order
     Then deberia aparecer Your order on My Store is complete
  
  
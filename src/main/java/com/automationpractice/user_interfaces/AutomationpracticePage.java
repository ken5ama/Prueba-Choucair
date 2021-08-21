package com.automationpractice.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class AutomationpracticePage extends PageObject {
	 public static final Target PRODUCT = Target.the("El primer producto ").located(By.xpath("//*[@id=\"homefeatured\"]/li[1]"));
	 public static final Target ADD_TO_CART = Target.the("Boton de agregar al carrito ").located(By.xpath("//*[@id=\"add_to_cart\"]/button"));
	 public static final Target PROCEED_TO_CHECKOUT = Target.the("Confirmacion del proceso ").located(By.buttonText("Proceed to checkout"));
	 public static final Target PROCEED_TO_FINAL_CHECKOUT = Target.the("Confirmacion del proceso ").located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	 public static final Target EMAIL_ADDRESS = Target.the("Campor para escribir el correo ").located(By.id("email_create"));
	 public static final Target CREATE_AN_ACCOUNT = Target.the("Boton para crear cuenta ").located(By.xpath("//*[@id=\"SubmitCreate\"]"));
	 public static final Target GENDER = Target.the("Genero del usuario ").located(By.xpath("//*[@id=\"id_gender1\"]"));
	 public static final Target FIRST_NAME = Target.the("Nombre del usuario ").located(By.id("customer_firstname"));
	 public static final Target LAST_NAME = Target.the("Apellido del usuario ").located(By.id("customer_lastname"));
	 public static final Target PASSWORD = Target.the("Contraseña del usuario").located(By.id("passwd"));
	 public static final Target DAYS = Target.the("Dia de nacimiento ").located(By.id("days"));
	 public static final Target MONTHS = Target.the("Mes de nacimiento ").located(By.id("months"));
	 public static final Target YEARS = Target.the("Anio de nacimiento ").located(By.id("years"));
	 public static final Target CITY = Target.the("Ciudad de residencia").located(By.id("city"));
	 public static final Target ADDRESS = Target.the("Direccion del usuario ").located(By.id("address1"));
	 public static final Target STATE = Target.the("Estado en el que reside ").located(By.id("id_state"));
	 public static final Target POSTCODE = Target.the("Codigo postal ").located(By.id("postcode"));
	 public static final Target PHONE_MOBILE = Target.the("Telefeno del usuairo ").located(By.id("phone_mobile"));
	 public static final Target REGISTER = Target.the("Boton de registro ").located(By.id("submitAccount"));
	 public static final Target PROCEED_TO_CHECKOUT_TO_SHIP = Target.the("Boton para continuat el proceso ").located(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
	 public static final Target CHECK_SHIPPING = Target.the("check para el envio ").located(By.id("cgv"));
	 public static final Target PROCEED_TO_CHECKOUT_TO_PAY = Target.the("Boton para continuar el proceso ").located(By.xpath("//*[@id=\"form\"]/p/button"));
	 public static final Target PAY_BY_BANK = Target.the("seleccionar como meto de pago mediante el banco ").located(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
	 public static final Target CONFIRM_MY_ORDER = Target.the("Boton para  confirmar pedido ").located(By.xpath("//*[@id=\"cart_navigation\"]/button"));
	 public static final Target RESULT = Target.the("Mensaje de compra realizada ").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p/strong"));
	 public static final Target EMAIL_LOGIN = Target.the("Email para loguearse ").located(By.id("email"));
	 public static final Target PASSWORD_LOGIN = Target.the("Contraseña ").located(By.id("passwd"));
	 public static final Target LOGIN = Target.the("Boton para loguearse ").located(By.xpath("//*[@id=\"SubmitLogin\"]"));
	
	 
	 
}

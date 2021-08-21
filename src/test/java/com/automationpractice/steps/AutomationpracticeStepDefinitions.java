package com.automationpractice.steps;



import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

import com.automationpractice.tasks.Writer;
import com.automationpractice.tasks.Clicks;
import com.automationpractice.user_interfaces.AutomationpracticePage;
import com.automationpractice.questions.Results;

import com.automationpractice.tasks.OpenTheBrowser;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class AutomationpracticeStepDefinitions {
	private AutomationpracticePage automationpracticePage;

	  @Before
	  public void setTheStage() {
	      OnStage.setTheStage(new OnlineCast());
	  }
	  
	@Given("Que la pagina de automationpractice este abierta")
	public void que_la_pagina_de_automationpractice_este_abierta() {
	    // Write code here that turns the phrase above into concrete actions
		 theActorCalled("Usuario").wasAbleTo(OpenTheBrowser.on(automationpracticePage));

	}

	@When("el usuario da click sobre un producto")
	public void el_usuarion_haga_hover_sobre_un_producto() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.PRODUCT));
	
	}

	@When("el usuario debe dar click en el boton Add to cart")
	public void el_usuario_debe_dar_click_en_el_boton() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.ADD_TO_CART));
	}
	
	@When("el usuario debe dar click en el boton Proceed to checkout")
	public void el_usuario_debe_dar_click_en_el_boton_Proceed_to_checkout() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.PROCEED_TO_CHECKOUT));
	}

	@When("el usuario debe dar click en el boton final Proceed to checkout")
	public void el_usuario_debe_dar_click_en_el_boton_final_Proceed_to_checkout() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.PROCEED_TO_FINAL_CHECKOUT));
	}
	@When("el usuario debe llenar el campo de Email address en la seccion CREATE AN ACCOUNT")
	public void el_usuario_debe_llenar_el_campo_de_en_la_seccion() {
	    // Write code here that turns the phrase above into concrete actions
		 theActorInTheSpotlight().attemptsTo(Writer.theTerm("examplea4a@yopmail.com", automationpracticePage.EMAIL_ADDRESS));
		 
	}
	
	@When("el usuario debe dar click en el boton Create an acconunt")
	public void el_usuario_debe_dar_click_Create_an_acconunt()  {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.CREATE_AN_ACCOUNT));
		
	}

	@When("el usuario debe llenar los datos del formulario")
	public void el_usuario_debe_llenar_los_datos_del_formulario() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.GENDER));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("test", automationpracticePage.FIRST_NAME));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("test", automationpracticePage.LAST_NAME));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("123123", automationpracticePage.PASSWORD));
		theActorInTheSpotlight().attemptsTo(Clicks.theElement( automationpracticePage.DAYS));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("1", automationpracticePage.DAYS));
		theActorInTheSpotlight().attemptsTo(Clicks.theElement( automationpracticePage.MONTHS));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("may", automationpracticePage.MONTHS));
		theActorInTheSpotlight().attemptsTo(Clicks.theElement( automationpracticePage.YEARS));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("2020", automationpracticePage.YEARS));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("test", automationpracticePage.ADDRESS));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("test", automationpracticePage.CITY));
		theActorInTheSpotlight().attemptsTo(Clicks.theElement( automationpracticePage.STATE));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("Alaska", automationpracticePage.STATE));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("00000", automationpracticePage.POSTCODE));
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("0000000000", automationpracticePage.PHONE_MOBILE));
		
		
	
	}
	
	@When("el usuario debe dar click en el boton Register")
	public void el_usuario_debe_dar_click_en_el_boton_Register() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.REGISTER));
	}
	
	@When("el usuario debe dar click en el boton Proceed to checkout to ship")
	public void el_usuario_debe_dar_click_en_el_boton_Proceed_to_checkout_to_ship() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.PROCEED_TO_CHECKOUT_TO_SHIP));
	}

	@When("el usuario debe dar click en Terms of service")
	public void el_usuario_debe_dar_click_en_Terms_of_service() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.CHECK_SHIPPING));
	}
	
	@When("el usuario debe dar click en el boton Proceed to checkout to pay")
	public void el_usuario_debe_dar_click_en_el_boton_Proceed_to_checkout_to_pay() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.PROCEED_TO_CHECKOUT_TO_PAY));
	}

	
	@When("el usuario debe seleccionar the Pay by bank wire order processing will be longer")
	public void el_usuario_debe_seleccionar_the_Pay_by_bank_wire_order_processing_will_be_longer() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.PAY_BY_BANK));
	}

	@When("el usuario debe dar click en el boton I confirm my order")
	public void el_usuario_debe_dar_click_en_el_boton_I_confirm_my_order() {
	    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.CONFIRM_MY_ORDER));
	}

	@Then("deberia aparecer Your order on My Store is complete")
	public void deberia_aparecer() {
	    // Write code here that turns the phrase above into concrete actions
		 theActorInTheSpotlight()
         .should(
         seeThat(Results.resultMessage(), 
         containsString("Your order on My Store is complete")
     )
   );
	}
	@When("el usuario debe llenar el campo de Email address en la seccion ALREADY REGISTERD?")
	public void el_usuario_debe_llenar_el_campo_de_Email_address_en_la_seccion_ALREADY_REGISTERD() {
    	// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("example7@jopmail.com", automationpracticePage.EMAIL_LOGIN));
	}

	@When("el usuario debe llenar el campo de Password address en la seccion ALREADY REGISTERD?")
	public void el_usuario_debe_llenar_el_campo_de_Password_address_en_la_seccion_ALREADY_REGISTERD() {
    	// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Writer.theTerm("123123", automationpracticePage.PASSWORD_LOGIN));
	}

	@When("el usuario debe dar click en el boton Sing in")
	public void el_usuario_debe_dar_click_en_el_boton_Sing_in() {
    	// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.LOGIN));
    	
	}	
	
}

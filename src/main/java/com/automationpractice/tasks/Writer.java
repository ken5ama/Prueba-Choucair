package com.automationpractice.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Writer implements Task {

  private String term;
  private Target target;

  public Writer(String term, Target target) {
    this.term = term;
    this.target = target;
  }

  @Step("{0} busca #term en la barra de busqueda")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.keyValues(term).into(this.target));
  }

  public static Writer theTerm(String termino, Target target) {
    return instrumented(Writer.class, termino, target);
  }

}

package com.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import com.automationpractice.user_interfaces.AutomationpracticePage;


public class Results implements Question<String> {
  @Override
  public String answeredBy(Actor actor) {
    return Text.of(AutomationpracticePage.RESULT).viewedBy(actor).asString();
  }

  public static Results resultMessage() {
    return new Results();
  }
}

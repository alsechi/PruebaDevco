package net.onlinenotepad.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class usuario implements Question<Boolean> {
    public static usuario puedeEntar() {
        return new usuario();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                IrA.laPagina(BLOC.url()),

                WaitUntil.the(TITULO, isVisible()).forNoMoreThan(5).seconds()
        );
        return (").equals(Text.of(BLOC).viewedBy(actor).asString());
    }
}

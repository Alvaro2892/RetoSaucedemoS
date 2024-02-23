package co.com.certificacion.RetoSaucedemoS.tasks;

import co.com.certificacion.RetoSaucedemoS.userinterface.UIAbrirPaginaSaucedemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class TaskAbrirPagina implements Task
{
    private UIAbrirPaginaSaucedemo uiAbrirPaginaSaucedemo;

    public static TaskAbrirPagina Saucedemo() {
        return Tasks.instrumented(TaskAbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo
                (
                        Open.browserOn(uiAbrirPaginaSaucedemo)

                );

    }
}

package net.onlinenotepad.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class notepadpage {
    public static final Target BOTON_CAMPO_TEXTO_ENRIQUECIDO = Target.the("Boton de texto enriquecido").located(By.id("richtextnote-tab"));
    public static final Target BOTON_NEGRILLA = Target.the("Boton para activar la negrilla").locatedBy("//*[@id='richtextnote']/main/div/div/div[1]/div/div[1]/button[1]");
    public static final Target CAMPO_DE_TEXTO = Target.the("Campo de texto a LLenar").located(By.id("editor"));
    public static final Target BOTON_SAVE = Target.the("Boton de guardado").locatedBy("//*[@id='richtextnote']/div/button");
    private notepadpage() {
        throw new IllegalStateException("Clase de interfaz de usuario.");
    }
}

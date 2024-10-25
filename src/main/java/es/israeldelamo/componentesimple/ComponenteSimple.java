package es.israeldelamo.componentesimple;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


import java.io.IOException;

/**
 * Una clase con un componente muy simple, tiene dos botones y un label
 */

public class ComponenteSimple extends VBox {

    /**
     * Este boton añade la palabra MAS
     */
    @FXML private Button plusBtn;
    /**
     * Este boton añade la palabra MENOS
     */
    @FXML private Button minusBtn;
    /**
     * Este label es accesible desde fuera
     */
    @FXML private Label label;

    /**
     * Cnstructor del componente simple y asociación con el FXML
     */
    public ComponenteSimple() {
        FXMLLoader loader = new FXMLLoader(
                ComponenteSimple.class.getResource(
                        "custom-component.fxml"
                )
        );
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Cambia el texto desde fuera del componente
     * @param text
     */
    public void newText(String text) {
        label.setText(text);
    }

    /**
     * Añade funcionalidad al botón y concatena la plabara "MAS"
     * @param event
     */
    @FXML
    public void onBotonMas(ActionEvent event) {
            label.setText(label.getText()+"MAS");

    }

    /**
     * Añade funcionalidad al botón y concatena la plabara "MENOS"
     * @param event
     */
    @FXML
    public void onBotonMenos(ActionEvent event) {
        label.setText(label.getText()+"MENOS");

    }





}
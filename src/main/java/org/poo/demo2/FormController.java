package org.poo.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FormController {
    private ToggleGroup tgGruppo = new ToggleGroup();

    @FXML
    private RadioButton rd1;
    @FXML
    private RadioButton rd2;
    @FXML
    private RadioButton rd3;
    @FXML
    private CheckBox chk1;
    @FXML
    private CheckBox chk2;
    @FXML
    private CheckBox chk3;

    @FXML
    private Label lbResultado1;
    @FXML
    private Label lbResultado2;

    @FXML
    private void initialize(){
        rd1.setToggleGroup(tgGruppo);
        rd2.setToggleGroup(tgGruppo);
        rd3.setToggleGroup(tgGruppo);
    }

    @FXML
    protected void onRdButtonClick() {
        String r = "";
        if( rd1.isSelected())
            r = "opcion 1!";
        if(rd2.isSelected())
            r = "opcion 2!";
        if(rd3.isSelected())
            r = "opcion 3!";

        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setHeaderText("Opciones selccionadas");
        alerta.setContentText("La opcion seleccionada es: " + r);

        lbResultado1.setText("La opcion seleccionada es: " + r);

        alerta.show();
    }

    @FXML
    protected void onChkButtonClick() {
        StringBuilder r =  new StringBuilder();
        r.append("Las opciones seleccionadas son:");
        if( chk1.isSelected())
            r.append("\nopcion 1");
        if(chk2.isSelected())
            r.append("\nopcion 2");
        if(chk3.isSelected())
            r.append("\nopcion 3");

        r.append("!");

        Alert alerta = new Alert(Alert.AlertType.INFORMATION);//Podemos enviar distintos tipos de alerta
        alerta.setTitle("Mensaje 1");
        alerta.setHeaderText("Opciones seleccionadas");
        alerta.setContentText(r.toString());
        lbResultado2.setText(r.toString());

        alerta.show();

    }
}
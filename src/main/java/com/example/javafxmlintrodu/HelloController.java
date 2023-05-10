package com.example.javafxmlintrodu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    private TextField inputText;
    @FXML
    private Rectangle rectangle1;

    @FXML
    private Rectangle rectangle2;

    @FXML
    private ColorPicker colorEscogido;

    @FXML
    private Label muestraTexto;


    @FXML
    protected void muestraBtn(){
        String opcion=inputText.getText();
        opcion = opcion.replaceAll("\\s","");
        System.out.println(opcion);
        if (opcion !=null){
            opcion = opcion.toLowerCase();
            System.out.println(opcion);
            switch (opcion){
                case "blue":
                case "azul":
                    rectangle1.setFill(Color.BLUE);
                    inputText.setText(null);
                    break;
                case "yellow":
                case "amarillo":
                    rectangle1.setFill(Color.YELLOW);
                    inputText.setText(null);
                    break;
                case "red":
                case "rojo":
                    rectangle1.setFill(Color.RED);
                    inputText.setText(null);
                    break;
                case "brown":
                case "marrón":
                    rectangle1.setFill(Color.BROWN);
                    inputText.setText(null);
                    break;
                case "green":
                case "verde":
                    rectangle1.setFill(Color.GREEN);
                    inputText.setText(null);
                    break;
                case "purple":
                case "morado":
                    rectangle1.setFill(Color.PURPLE);
                    inputText.setText(null);
                    break;
                case "gray":
                case "gris":
                    rectangle1.setFill(Color.GRAY);
                    inputText.setText(null);
                case "white":
                case "blanco":
                    rectangle1.setFill(Color.WHITE);
                    inputText.setText(null);
                default:
                    muestraTexto.setText("Color introducido no valido");
                    inputText.setText(null);
            }
        }else muestraTexto.setText("Debe introducir el color");


    }



    public void cambiaColor(ActionEvent actionEvent) {

        rectangle2.setFill(colorEscogido.getValue());
    }
}
package org.example;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
       stage.setTitle("Lista desplegable");
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Opción 1", "Opción 2", "Opción 3", "Opción 4");

        Button botonMostrar = new Button("Mostrar elemento");
        Label resultado = new Label();
        botonMostrar.setOnAction(e -> {
            String opcion = comboBox.getValue();
            if (opcion != null) {
                resultado.setText("Opción elegida -->  "+opcion);
            } else {
                resultado.setText("Escoge una opción de la lista.");
            }
        });
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(comboBox,botonMostrar,resultado);
        Scene scene = new Scene(vBox,300,200);
        stage.setScene(scene);
        stage.show();
    }
}

package com.example.lab5x3;

import com.example.lab5x3.VM.ButtonController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class HelloApplication extends Application {

    public static ButtonController controller = new ButtonController();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 450);
        stage.setTitle("Лабораторная работа 5");
        stage.setScene(scene);
        stage.show();
        controller.Init();
    }

    public static void main(String[] args) {
        launch();
    }
}
//fx:controller="com.example.lab5x3.VM.ButtonController"
package com.example.lab5x3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 450);
        stage.setTitle("Лабораторная работа 5");
        stage.setScene(scene);*/
        stage.setTitle("Лабораторная работа 5");
        Scene scene = new Scene(new VBox(), 650, 450);
        MenuBar menuBar = new MenuBar();
        Menu input = new Menu("input");
        Menu change = new Menu("input");
        Menu exit = new Menu("input");
        menuBar.getMenus().addAll(input, change, exit);
        ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
//fx:controller="com.example.lab5x3.VM.ButtonController"
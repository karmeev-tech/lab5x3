package com.example.lab5x3.Model;

import com.example.lab5x3.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class InputClass extends Application {
    Stage stage=new Stage();
    @FXML
    private RadioButton increase;
    @FXML
    private RadioButton decrease;
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("inputform.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 300);
        stage.setTitle("Окно ввода");
        stage.setScene(scene);
        stage.show();
        }
        public static void main(String[] args) {
            launch(args);
        }
        public void  showWindow() throws Exception {
            start(stage);
        }
        @FXML
        protected void Input(){

        }
        @FXML
        protected void RadioSwitching(){
            increase.setSelected(false);
            decrease.setSelected(true);
        }
        @FXML
        protected void RadioSwitching2()
        {
            increase.setSelected(true);
            decrease.setSelected(false);
        }

}

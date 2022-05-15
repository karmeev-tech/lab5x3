package com.example.lab5x3.VM;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ButtonController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    @FXML
    private void InputAction(ActionEvent event){
        System.out.println("input");
        //exit(0);
    }
    @FXML
    private void ChangeAction(ActionEvent event){
        System.out.println("change");
        //exit(0);
    }
    @FXML
    private void ExitAction(ActionEvent event){
        System.out.println("exit");
        //exit(0);
    }
}
package com.example.lab5x3.VM;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class ButtonController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    @FXML
    private MenuItem inputButton;
    @FXML
    private MenuItem changeButton;
    @FXML
    private MenuItem exitButton;

    public void Init(){
        System.out.print("clear");
        //inputButton.setVisible(true);
    }
    @FXML
    private void InputAction(ActionEvent event){
        System.out.println("input");
    }
    @FXML
    private void ChangeAction(ActionEvent event){
    System.out.println("change");
    }
    @FXML
    private void ExitAction(ActionEvent event){
        System.out.println("exit");
        System.exit(0);
    }
}
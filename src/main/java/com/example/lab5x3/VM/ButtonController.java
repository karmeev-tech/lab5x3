package com.example.lab5x3.VM;

import com.example.lab5x3.Model.ChangeClass;
import com.example.lab5x3.Model.InputClass;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

import static java.lang.System.exit;

public class ButtonController {
    @FXML
    private MenuItem inputButton;
    @FXML
    private MenuItem changeButton;
    @FXML
    private MenuItem exitButton;
    @FXML
    protected void InputAction() throws Exception {
        InputClass inputWindow = new InputClass();
        inputWindow.showWindow();
    }
    @FXML
    protected void ChangeAction(){
        ChangeClass.Change();
    }
    @FXML
    protected void ExitAction(){
        System.out.println("exit");
        exit(0);
    }
}
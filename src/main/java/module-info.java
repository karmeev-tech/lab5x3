module com.example.lab5x3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab5x3 to javafx.fxml;
    opens com.example.lab5x3.VM to javafx.fxml;
    opens com.example.lab5x3.Model to javafx.fxml;
    exports com.example.lab5x3;
    exports com.example.lab5x3.VM;
    exports com.example.lab5x3.Model;
}
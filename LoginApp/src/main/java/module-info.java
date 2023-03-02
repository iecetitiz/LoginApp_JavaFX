module com.example.loginapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginapp to javafx.fxml;
    exports com.example.loginapp;
}
package com.example.loginapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloController {

    @FXML
    private Button login_button;

    @FXML
    private PasswordField password;

    @FXML
    private TextField user_name;


    @FXML
    private Label welcomeText;

    @FXML
    public void initialize() {
        login_button.setDisable(true);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void clickLoginButton(ActionEvent event) {
        if(user_name.getText().equals("username") && password.getText().equals("password1234")) {
            welcomeText.setText("you logged in successfully");
        } else {
            welcomeText.setText("username or password is incorrect");
        }
    }




    //login button will be disabled if username or password is empty, or they have space character
    @FXML
    void makeDisable(KeyEvent event) {
        String user_name_text = user_name.getText().trim();
        String password_text = password.getText().trim();
        boolean makeDisable = user_name_text.isEmpty() || password_text.isEmpty();
       login_button.setDisable(makeDisable);

    }
}
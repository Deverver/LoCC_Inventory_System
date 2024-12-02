package com.example.locc_inventory_system;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
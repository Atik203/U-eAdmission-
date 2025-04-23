package com.ueadmission;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

import javax.swing.*;
import java.io.IOException;

public class MainController {
    @FXML
    private Label welcomeText;
    private JInternalFrame primaryStage;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com.ueadmission/login.fxml"));
        Scene loginScene = new Scene(loader.load());
//        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(loginScene);
        stage.setTitle("Login - UIU Admission");
//        primaryStage.setResizable(true);
        stage.setMaximized(true);
        stage.show();
    }
}

package com.ueadmission;

import atlantafx.base.theme.PrimerDark;
import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(javafx.stage.Stage stage)  throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com.ueadmission/main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 768);
        // set the fullscreen mode

        Image icon = new Image(getClass().getResourceAsStream("/com.ueadmission/uiu_logo_update.png"));
        stage.getIcons().add(icon);
        stage.setMaximized(true);
        stage.setTitle("UeAdmission - Home");
        stage.setMinWidth(1280);
        stage.setMinHeight(768);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

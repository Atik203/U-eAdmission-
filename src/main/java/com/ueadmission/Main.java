package com.ueadmission;

import atlantafx.base.theme.PrimerDark;
import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(javafx.stage.Stage stage)  throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com.ueadmission/main.fxml"));
        Scene scene = new Scene(fxmlLoader.load( ), 1280, 720);
        // set the fullscreen mode

        Image icon = new Image(getClass().getResourceAsStream("/com.ueadmission/uiu_logo_update.png"));
        stage.getIcons().add(icon);
        stage.initStyle(StageStyle.DECORATED);

        stage.setTitle("UeAdmission - Home");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package com.danielpresas_100699431;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class AnimationController implements Initializable {

    @FXML
    private Rectangle rectangle;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        var t = new TranslateTransition();
        t.setNode(rectangle);
        t.setDuration(Duration.millis(2000));
        t.setCycleCount(TranslateTransition.INDEFINITE);
        t.setByX(350);
        t.setAutoReverse(true);
        t.play();
    }

    @FXML
    private void backToMain() throws IOException {
        JavaFXApp.setRoot("main");
    }

}

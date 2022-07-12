package com.danielpresas_100699431;

import java.io.IOException;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    private void switchToAnimation() throws IOException {
        JavaFXApp.setRoot("animation");
    }

    @FXML
    private void switchTo2dGfx() throws IOException {
        JavaFXApp.setRoot("2dgfx");
    }

    @FXML
    private void switchToAbout() throws IOException {
        JavaFXApp.setRoot("about");
    }

}

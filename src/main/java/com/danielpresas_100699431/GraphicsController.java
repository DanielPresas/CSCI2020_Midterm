package com.danielpresas_100699431;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

public class GraphicsController implements Initializable {

    @FXML
    private Group drawRegion;

    public void initialize(URL arg0, ResourceBundle arg1) {
        var dLeftRect = new Rectangle();
        dLeftRect.setWidth(20);
        dLeftRect.setHeight(200);
        dLeftRect.setX(25);
        dLeftRect.setY(100);

        var dRightArc = new Arc();
        dRightArc.setCenterX(40);
        dRightArc.setCenterY(200);
        dRightArc.setRadiusX(75.0f);
        dRightArc.setRadiusY(100.0f);
        dRightArc.setStartAngle(270.0f);
        dRightArc.setLength(180.0f);

        dRightArc.setType(ArcType.OPEN);
        dRightArc.setStroke(Color.BLACK);
        dRightArc.setStrokeWidth(20.0f);
        dRightArc.setStrokeType(StrokeType.INSIDE);
        dRightArc.setFill(null);

        var pLeftRect = new Rectangle();
        pLeftRect.setWidth(20);
        pLeftRect.setHeight(200);
        pLeftRect.setX(150);
        pLeftRect.setY(100);

        var pRightArc = new Arc();
        pRightArc.setCenterX(165);
        pRightArc.setCenterY(160);
        pRightArc.setRadiusX(75.0f);
        pRightArc.setRadiusY(60.0f);
        pRightArc.setStartAngle(270.0f);
        pRightArc.setLength(180.0f);

        pRightArc.setType(ArcType.OPEN);
        pRightArc.setStroke(Color.BLACK);
        pRightArc.setStrokeWidth(20.0f);
        pRightArc.setStrokeType(StrokeType.INSIDE);
        pRightArc.setFill(null);

        drawRegion.getChildren().add(dLeftRect);
        drawRegion.getChildren().add(dRightArc);
        drawRegion.getChildren().add(pLeftRect);
        drawRegion.getChildren().add(pRightArc);
    };

    @FXML
    private void backToMain() throws IOException {
        JavaFXApp.setRoot("main");
    }
}

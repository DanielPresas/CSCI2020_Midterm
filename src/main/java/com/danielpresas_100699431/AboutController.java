package com.danielpresas_100699431;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.*;
import javafx.scene.control.*;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class AboutController implements Initializable {

    @FXML
    private Label studentNumber;

    @FXML
    private Label studentName;

    @FXML
    private Label studentEmail;

    @FXML
    private Label softwareDescription;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        var factory = DocumentBuilderFactory.newInstance();
        var path = App.class.getResource("studentinfo.xml").toExternalForm();
        try {
            var builder = factory.newDocumentBuilder();
            var doc = builder.parse(path);
            var nodes = doc.getDocumentElement().getChildNodes();
            for (int i = 0; i < nodes.getLength(); i++) {
                if(nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    var element = (Element)nodes.item(i);

                    if(element.getTagName() == "student") {
                        var id = element.getAttribute("id");
                        studentNumber.setText(id);
                        var studentInfoNodes = element.getChildNodes();
                        for (int j = 0; j < studentInfoNodes.getLength(); j++) {
                            if(studentInfoNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                var childElement = (Element)studentInfoNodes.item(j);
                                System.out.println("Student ID: " + id + " -> " + childElement.getTagName() + ": " + childElement.getTextContent());

                                switch (childElement.getTagName()) {
                                    case "name":
                                        studentName.setText(childElement.getTextContent());
                                        break;
                                    case "email":
                                        studentEmail.setText(childElement.getTextContent());
                                    default:
                                        break;
                                }
                            }
                        }
                    }
                    else if(element.getTagName() == "software-description") {
                        System.out.println("Description: " + element.getTextContent());
                        softwareDescription.setText(element.getTextContent());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    private void backToMain() throws IOException {
        JavaFXApp.setRoot("main");
    }

}

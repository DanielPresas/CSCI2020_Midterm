module com.danielpresas_100699431 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    opens com.danielpresas_100699431 to javafx.fxml;
    exports com.danielpresas_100699431;
}

module com.example.javafxmlintrodu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxmlintrodu to javafx.fxml;
    exports com.example.javafxmlintrodu;
}
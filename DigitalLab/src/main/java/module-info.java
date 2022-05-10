module com.example.digitallab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.digitallab to javafx.fxml;
    exports com.example.digitallab;
}
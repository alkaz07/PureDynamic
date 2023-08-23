module com.example.puredynamic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.puredynamic to javafx.fxml;
    exports com.example.puredynamic;
}
module com.example.tally {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tally to javafx.fxml;
    exports com.example.tally;
}
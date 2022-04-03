/**
 *
 */
module com.example.oslec_technology_av {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.oslec_technology_av3 to javafx.fxml;
    exports com.example.oslec_technology_av3;
}
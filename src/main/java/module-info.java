module com.example.softwareengineering {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.softwareengineering to javafx.fxml;
    exports com.example.softwareengineering;
}
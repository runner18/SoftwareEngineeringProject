module com.example.softwareengineering {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.softwareengineering to javafx.fxml;
    exports com.example.softwareengineering;
}
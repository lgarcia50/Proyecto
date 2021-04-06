module com.mycompany.labo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.labo to javafx.fxml;
    exports com.mycompany.labo;
}

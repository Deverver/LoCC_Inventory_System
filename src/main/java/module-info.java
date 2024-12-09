module com.example.locc_inventory_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.locc_inventory_system to javafx.fxml;
    exports Launch;
    opens Launch to javafx.fxml;
    exports DbController;
    opens DbController to javafx.fxml;
    exports Controller;
    opens Controller to javafx.fxml;
    exports ModelController;
    opens ModelController to javafx.fxml;
    exports com.example.locc_inventory_system.UiController;
    opens com.example.locc_inventory_system.UiController to javafx.fxml;
}
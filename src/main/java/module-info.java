module com.u.eadmission.ueadmission {
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
    requires atlantafx.base;
    requires java.desktop;
    requires java.sql;

    opens com.ueadmission.student to javafx.fxml;
    opens com.ueadmission to javafx.fxml;
    exports com.ueadmission;
    exports com.ueadmission.student;
}
module org.example.javafx01loginscreen {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.javafx01loginscreen to javafx.fxml;
    exports org.example.javafx01loginscreen;
}
package org.example.javafx01loginscreen;    // OOP January 2025

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/// To create a JavaFX Application we define a class that
/// extends (inherits from) the Application class.
/// i.e. the "javafx.application.Application" class that is imported.
/// This makes methods such as launch() and start() available in our application.
///
/// The UI controls for this app are defined in the FXML file "login-view.fxml"
/// The program will instantiate (create) the UI controls based on the
/// FXML markup.  Our program controller "LoginController" can obtain references
/// to those controls by identifying them by their "id"s.

public class LoginApplication extends Application {

    public static void main(String[] args) {
        launch(); // launch (create) this JavaFX Application
    }

    /// When this Application is launched, the start() method in the
    /// App is automatically called, and a "Stage" object is passed in as an argument.
    /// The Stage represents the window that we can add our "Scene" to.
    /// The Scene contains a hierarchy of UI Controls that are loaded by FXMLLoader.load()
    ///
    @Override
    public void start(Stage stage) throws IOException {
        /// Load the UI Component descriptors from the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("login-view.fxml"));
        /// create a 'Scene' to contain those UI components.
        Scene scene = new Scene(fxmlLoader.load(), 420, 480);
        /// The FXMLLoader will also create the LoginController that
        /// is named in the FXML file, and associates it with the UI controls.

        stage.setTitle("Facebook Login");
        stage.setScene(scene);  /// add the Scene to the Stage.
        stage.show();
    }
}
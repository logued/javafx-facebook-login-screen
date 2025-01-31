package org.example.javafx01loginscreen;  // Jan 2025

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/// This is the Controller component in the Model-View-Controller architecture.
/// Its role is to provide the event handlers (methods) that are called
/// when a UI component is activated (e.g. button clicked, text entered etc.).
/// The Controller usually runs code that will change the model, and
/// update the GUI.
/// The Controller is instantiated by the FXMLLoader from the MainAPP.

public class LoginController {

    /// The @FXML annotation enables the FXMLLoader to 'inject' UI Control objects defined in
    /// an FXML file into the Controller by binding the reference fields in the controller class
    /// to those UI Controls.   In other words,
    /// if we annotate the "emailField" with "@FXML", then it will be initialized
    /// by the FXMLLoader when the load() method is called by an element in the
    /// FXML file identified by name i.e. fx:id="emailField".
    /// This means that you do not have to instantiate the UI Controls in your code,
    /// (e.g. emailField = new TextField() ) as it is done for you by the JavaFX system.
    /// This is an example of "Dependency Injection".
    ///
    @FXML // <-- this is an FXML annotation
    private Label eventDetails; /// reference to a Label UI control that is defined in the FXML file.

    @FXML
    private TextField emailField;   /// reference to TextField that is injected from FXML file
    ///
    @FXML
    private PasswordField passwordField;

    /// Define the Event Listener method onLoginButtonClick()
    /// that will be called when the Login button is clicked.
    /// This method is identified by name as the button's
    /// event listener in the FXML file:  onAction="#onLoginButtonClick" and
    /// is assigned to the onAction attribute of the Button.
    ///
    /// Notice the "@FXML" annotation before the button clicked method.
    /// This annotation marks the method as a target for binding for FXML.
    ///
    @FXML
    protected void onLoginButtonClick() {
        String email = this.emailField.getText();   // get current text from the field
        String password = this.passwordField.getText();
        // Display the email and password to show that we have accessed them.
        eventDetails.setText("Log In was clicked:  Email: " + email +", Password: " + password);
    }

    /// Define an event handler (or listener) method to be called when the user
    /// clicks on the "Forgot Password...Sign Up..." text message (on GUI).
    /// This event handler is set in the FXML definition of the Label control
    /// as follows "onMouseClicked="#onSignUpClick" "
    @FXML
    protected void onSignUpClick() {
        eventDetails.setText("User has forgotten account details, and has clicked to Sign Up");
        this.emailField.clear();
        this.passwordField.clear();
    }

    public void initialize() {
        // this method is called after the Controller constructor is executed,
        // and, after the @FXML fields are populated (injected).
        // In this sample app, we don't need to use this method.
    }
}
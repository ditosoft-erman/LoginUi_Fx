package Sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    @FXML
    private TextField tf_username;

    @FXML
    private PasswordField pf_password;

    @FXML
    private Button btn_login;

    @FXML
    private Label lbl_error;

    @FXML
    private void initialize() {
        btn_login.setOnAction(event -> handleLoginButtonAction());
    }

    private void handleLoginButtonAction() {
        String username = tf_username.getText();
        String password = pf_password.getText();

        if (Main.USERNAME.equals(username) && Main.PASSWORD.equals(password)) {
            showAlert(Alert.AlertType.INFORMATION, "Login Successful", "Welcome, " + username + "!");
            switchToOptionsScene();
        } else {
            lbl_error.setText("Incorrect username or password.");
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void switchToOptionsScene() {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scenes/Options.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        // Get the current stage
        Stage stage = (Stage) btn_login.getScene().getWindow();

        // Set the new scene
        stage.setScene(scene);
        stage.show(); // Show the new scene

    } catch (IOException e) {
        e.printStackTrace();
        showAlert(Alert.AlertType.ERROR, "Error", "Failed to load Options scene.");
    }
}


}

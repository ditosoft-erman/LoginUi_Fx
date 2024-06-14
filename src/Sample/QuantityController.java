
package Sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class QuantityController {

    @FXML
    private Button btn_back;

    @FXML
    private Label quantityLabel;
    private int quantityValue = 0;

    @FXML
    private void incrementQuantity() {
        quantityValue++;
        updateQuantityLabel();
    }

    @FXML
    private void decrementQuantity() {
        quantityValue--;
        updateQuantityLabel();
    }

    @FXML
    private void resetQuantity() {
        quantityValue = 0;
        updateQuantityLabel();
    }

    private void updateQuantityLabel() {
        quantityLabel.setText(Integer.toString(quantityValue));
    }

    public void initialize() {
        btn_back.setOnAction(event -> goBackToOption());
    }

    private void goBackToOption() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scenes/Options.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) btn_back.getScene().getWindow();
            stage.setTitle("Quantity");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

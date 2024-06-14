package Sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class OptionsController {

    @FXML
    private Button btn_trafficLight;

    @FXML
    private Button btn_quantity;

    @FXML
    private Button btn_toDoList;

    @FXML
    private void initialize() {
        btn_trafficLight.setOnAction(event -> handleTrafficLightButtonAction());
        btn_quantity.setOnAction(event -> handleQuantityButtonAction());
        btn_toDoList.setOnAction(event -> handleToDoListButtonAction());
    }

    private void handleTrafficLightButtonAction() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scenes/TrafficLight.fxml"));
            Parent root = loader.load();


            Scene scene = new Scene(root);
            Stage stage = (Stage) btn_trafficLight.getScene().getWindow();



            stage.setTitle("Traffic Light");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleQuantityButtonAction() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scenes/Quantity.fxml"));
            Parent root = loader.load();


            Scene scene = new Scene(root);
            Stage stage = (Stage) btn_quantity.getScene().getWindow();



            stage.setTitle("Quantity");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleToDoListButtonAction() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scenes/ToDo.fxml"));
            Parent root = loader.load();


            Scene scene = new Scene(root);

            Stage stage = (Stage) btn_quantity.getScene().getWindow();



            stage.setTitle("ToDo");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

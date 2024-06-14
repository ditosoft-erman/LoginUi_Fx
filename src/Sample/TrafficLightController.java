package Sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class TrafficLightController {

    @FXML
    private Button btn_back;

    @FXML
    private Circle redLight;

    @FXML
    private Circle yellowLight;

    @FXML
    private Circle greenLight;

    private static final Duration RED_LIGHT_DURATION = Duration.seconds(5);
    private static final Duration YELLOW_LIGHT_DURATION = Duration.seconds(2);
    private static final Duration GREEN_LIGHT_DURATION = Duration.seconds(5);

    private Timeline timeline;

    @FXML
    private void initialize() {
        btn_back.setOnAction(event -> goBackToOption());
        initTimeline();
    }

    private void initTimeline() {
        timeline = new Timeline(
                new KeyFrame(Duration.ZERO, event -> switchToRed()),
                new KeyFrame(RED_LIGHT_DURATION, event -> switchToYellow()),
                new KeyFrame(RED_LIGHT_DURATION.add(YELLOW_LIGHT_DURATION), event -> switchToGreen()),
                new KeyFrame(RED_LIGHT_DURATION.add(YELLOW_LIGHT_DURATION).add(GREEN_LIGHT_DURATION), event -> switchToRed())
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @FXML
    private void switchToRed() {
        redLight.setFill(Color.RED);
        yellowLight.setFill(Color.GRAY);
        greenLight.setFill(Color.GRAY);
    }

    @FXML
    private void switchToYellow() {
        redLight.setFill(Color.GRAY);
        yellowLight.setFill(Color.YELLOW);
        greenLight.setFill(Color.GRAY);
    }

    @FXML
    private void switchToGreen() {
        redLight.setFill(Color.GRAY);
        yellowLight.setFill(Color.GRAY);
        greenLight.setFill(Color.GREEN);
    }

    @FXML
    private void goBackToOption() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scenes/Options.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) btn_back.getScene().getWindow();
            stage.setTitle("Traffic Light");
            stage.setScene(scene);
            stage.show();
            timeline.stop();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

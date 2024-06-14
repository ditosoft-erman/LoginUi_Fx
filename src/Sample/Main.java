package Sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static final String USERNAME = "Mae";
    public static final String PASSWORD = "123";

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Scenes/Login.fxml"))));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

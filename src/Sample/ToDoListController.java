package Sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDoListController {
    @FXML
    private Button btn_back;

    @FXML
    private ListView<String> taskListView;

    @FXML
    private TextField taskField;

    @FXML
    private Button updateTaskButton;

    private ObservableList<String> tasks;
    private int selectedIndex = -1;

    public void initialize() {
        tasks = FXCollections.observableArrayList();
        taskListView.setItems(tasks);
        btn_back.setOnAction(event -> goBackToOption());
    }

    @FXML
    private void handleAddTask() {
        String task = taskField.getText();
        if (task != null && !task.trim().isEmpty()) {
            tasks.add(task);
            taskField.clear();
        }
    }

    @FXML
    private void handleUpdateTask() {
        String task = taskField.getText();
        if (task != null && !task.trim().isEmpty() && selectedIndex >= 0) {
            tasks.set(selectedIndex, task);
            taskField.clear();
            selectedIndex = -1;
            taskListView.getSelectionModel().clearSelection();
            updateTaskButton.setDisable(true);
        }
    }

    @FXML
    private void handleDeleteTask() {
        String selectedTask = taskListView.getSelectionModel().getSelectedItem();
        if (selectedTask != null) {
            tasks.remove(selectedTask);
            taskField.clear();
            selectedIndex = -1;
            updateTaskButton.setDisable(true);
        }
    }

    @FXML
    private void handleTaskSelection(MouseEvent event) {
        String selectedTask = taskListView.getSelectionModel().getSelectedItem();
        if (selectedTask != null) {
            taskField.setText(selectedTask);
            selectedIndex = tasks.indexOf(selectedTask);
            updateTaskButton.setDisable(false);
        }
    }

    @FXML
    private void handleClearSelection() {
        taskListView.getSelectionModel().clearSelection();
        taskField.clear();
        selectedIndex = -1;
        updateTaskButton.setDisable(true);
    }

    @FXML
    private void goBackToOption() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scenes/Options.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) btn_back.getScene().getWindow();
            stage.setTitle("ToDo List");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

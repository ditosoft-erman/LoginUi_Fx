package Sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller{
//    @FXML
//    private Button btn_close;
//
//    @FXML
//    private Button btn_login;
//
//    @FXML
//    private PasswordField pf_password;
//
//    @FXML
//    private TextField tf_username;
//
//    @FXML
//    private Label lbl_error;

//    private String errorMessage = "";
//
//    private boolean isFieldFilled(){
//        boolean  isFilled = true;
//        if(tf_username.getText().isEmpty()){
//            isFilled = false;
//            errorMessage = "Username is empty";
//        }
//        if(pf_password.getText().isEmpty()){
//            isFilled = false;
//            if(errorMessage.isEmpty()){
//                errorMessage = "Password is empty";
//            }else{
//                errorMessage += "\nPassword is incorrect";
//            }
//        }
//        lbl_error.setText(errorMessage);
//        return isFilled;
//    }
//    private boolean isValid(){
//    boolean isValid = true;
//    if(tf_username.getText().equals(Main.USERNAME)){
//        isValid = false;
//        errorMessage = "Invalid Username";
//    }
//
//    if(!pf_password.equals(Main.PASSWORD)){
//        isValid = false;
//        if(errorMessage.isEmpty()){
//            errorMessage = "Invalid Password";
//        }else {
//            errorMessage += "\nPassword is incorrect";
//        }
//    }
//
//    lbl_error.setText(errorMessage);
//    return isValid;
//    }
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        btn_close.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                System.exit(0);
//            }
//        });
//
//        btn_login.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                if(isFieldFilled() && isValid()){
//                        //do something
//                }
//            }
//        });
//    }
}

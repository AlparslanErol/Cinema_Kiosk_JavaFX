package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static GUI.App.list;

public class LoginController {

    @FXML
    private Label loginText;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPassword;

    static String currentUser;


    public void login(ActionEvent event) throws Exception {
        for (UserAccount u : list) {
            if (u.isActive()) {
                if (txtUserName.getText().equals(u.getUsername())) {
                    if (txtPassword.getText().equals(u.getPassword())) {
                        loginText.setText("Login Success");
                        currentUser = u.getUsername();
                        Stage stage = new Stage();
                        stage.initModality(Modality.APPLICATION_MODAL);
                        Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        Stage prevStage = (Stage) loginText.getScene().getWindow();
                        prevStage.close();
                        stage.show();
                    } else {
                        loginText.setText("No Such User Found!");
                    }
                } else {
                    loginText.setText("No Such User Found!");
                }
            }
        }
            txtUserName.setText("");
            txtPassword.setText("");
    }

    public void signup(ActionEvent actionEvent) throws Exception {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Parent root = FXMLLoader.load(getClass().getResource("/signup.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
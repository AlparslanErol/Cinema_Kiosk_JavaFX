package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static GUI.App.list;


public class SignupController {


    @FXML
    private TextField txtSignUserName;

    @FXML
    private TextField txtSignPassword;

    @FXML
    private TextField txtSignPassword1;


    public void signup(ActionEvent actionEvent) throws Exception {
        if (txtSignPassword.getText().equals(txtSignPassword1.getText())) {
            list.add(new UserAccount(txtSignUserName.getText(), txtSignPassword.getText()));
            System.out.println(list);
            Accounts account = new Accounts(list);
            WriteDataToFile.loginToFile(account,"login.xml");
            Stage stage = (Stage) txtSignPassword.getScene().getWindow();
            stage.close();
        } else {
            txtSignUserName.setText("");
            txtSignPassword.setText("");
            txtSignPassword1.setText("");
        }
    }
}
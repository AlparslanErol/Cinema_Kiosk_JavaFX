package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import static GUI.App.listMovies;
import static GUI.App.listSeats;
import static GUI.MainController.currentMovie;


public class TicketStageController {

    static int currentSeat;
    @FXML
    public ImageView seat1;

    @FXML
    public ImageView seat2;

    @FXML
    public ImageView seat3;

    @FXML
    public ImageView seat4;

    @FXML
    public ImageView seat5;

    @FXML
    public Button s1;

    @FXML
    public Button s2;

    @FXML
    public Button s3;

    @FXML
    public Button s4;

    @FXML
    public Button s5;


    private int index;
    private int counter = 0;

    public void initialize() throws Exception {
        for (Movie m : listMovies) {
            if (currentMovie.equals(m.getTitle())) {
                index = counter;
                break;
            }
            counter += 1;
        }
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1 -> {
                    if (listSeats.get(index).getSeat1() == 1) {
                        seat1.setImage(new Image("https://image.flaticon.com/icons/png/512/24/24868.png"));
                        s1.setDisable(true);
                    }
                }
                case 2 -> {
                    if (listSeats.get(index).getSeat2() == 1) {
                        seat2.setImage(new Image("https://image.flaticon.com/icons/png/512/24/24868.png"));
                        s2.setDisable(true);
                    }
                }
                case 3 -> {
                    if (listSeats.get(index).getSeat3() == 1) {
                        seat3.setImage(new Image("https://image.flaticon.com/icons/png/512/24/24868.png"));
                        s3.setDisable(true);
                    }
                }
                case 4 -> {
                    if (listSeats.get(index).getSeat4() == 1) {
                        seat4.setImage(new Image("https://image.flaticon.com/icons/png/512/24/24868.png"));
                        s4.setDisable(true);
                    }
                }
                case 5 -> {
                    if (listSeats.get(index).getSeat5() == 1) {
                        seat5.setImage(new Image("https://image.flaticon.com/icons/png/512/24/24868.png"));
                        s5.setDisable(true);
                    }
                }
            }
        }
    }

    private void stageCreate() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/form.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Stage prevStage = (Stage) seat1.getScene().getWindow();
        prevStage.close();
        stage.show();
    }

    public void click1(ActionEvent actionEvent) throws IOException {
        currentSeat = 1;
        stageCreate();
    }

    public void click2(ActionEvent actionEvent) throws IOException {
        currentSeat = 2;
        stageCreate();
    }

    public void click3(ActionEvent actionEvent) throws IOException {
        currentSeat = 3;
        stageCreate();

    }

    public void click4(ActionEvent actionEvent) throws IOException {
        currentSeat = 4;
        stageCreate();

    }

    public void click5(ActionEvent actionEvent) throws IOException {
        currentSeat = 5;
        stageCreate();
    }
}
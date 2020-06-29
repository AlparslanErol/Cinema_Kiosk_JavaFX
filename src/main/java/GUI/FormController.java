package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static GUI.App.listMovies;
import static GUI.App.listSeats;
import static GUI.LoginController.currentUser;
import static GUI.MainController.currentMovie;
import static GUI.TicketStageController.currentSeat;

public class FormController {


    private int index;
    private int counter = 0;

    @FXML
    private Button submitButton;


    public void initialize() throws Exception {
        for (Movie m : listMovies) {
            if (currentMovie.equals(m.getTitle())) {
                index = counter;
                break;
            }
            counter += 1;
        }
    }

    public void submitClick(ActionEvent actionEvent) throws Exception {
        switch (currentSeat) {
            case 1 -> {
                listSeats.get(index).setSeat1(1);
                listSeats.get(index).setName1(currentUser);
            }
            case 2 -> {
                listSeats.get(index).setSeat2(1);
                listSeats.get(index).setName2(currentUser);
            }
            case 3 -> {
                listSeats.get(index).setSeat3(1);
                listSeats.get(index).setName3(currentUser);
            }
            case 4 -> {
                listSeats.get(index).setSeat4(1);
                listSeats.get(index).setName4(currentUser);
            }
            case 5 -> {
                listSeats.get(index).setSeat5(1);
                listSeats.get(index).setName5(currentUser);
            }
        }
        Movie movie = new Movie(listSeats);
        WriteDataToFile.seatToFile(movie,"seat.xml");

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Parent root = FXMLLoader.load(getClass().getResource("/ticketStage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Stage prevStage = (Stage) submitButton.getScene().getWindow();
        prevStage.close();
        stage.show();
    }
}
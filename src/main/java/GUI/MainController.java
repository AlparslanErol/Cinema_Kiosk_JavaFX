package GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static GUI.App.listMovies;


public class MainController {

    @FXML
    private VBox gallery;
    static String currentMovie;


    /**
     * INSPIRED FROM PJAIT GUI CLASS GROUP 21C LESSON - 11
     * @URL: https://dojo.pjwstk.edu.pl/en/gui/lesson-11
     *
     */
    public void initialize() throws Exception {
        for (Movie m : listMovies) {
            HBox hBox = new HBox();
            ImageView image = new ImageView();
            image.setFitHeight(300);
            image.setFitWidth(300);
            image.setImage(new Image(m.getImage()));
            Label label = new Label();
            Button button = new Button("",image);
            button.setOnAction(e -> {
                currentMovie = m.getTitle();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/ticketStage.fxml"));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                assert root != null;
                Scene scene = new Scene(root);
                stage.setScene(scene);
                Stage prevStage = (Stage) gallery.getScene().getWindow();
                prevStage.close();
                stage.show();
            });
            label.setText("Title...........: " + m.getTitle() + "\n" +
                          "Time..........: " + m.getTime() + "\n" +
                          "Directors....: " + m.getDirectors() + "\n" +
                          "Stars..........: " + m.getStars() + "\n" +
                          "IMDB Rate..: " + m.getRate() + "\n" +
                          "Duration.....: " + m.getDuration());
            label.getStyleClass().add("LabelMovie");
            hBox.getChildren().addAll(button, label);
            gallery.getChildren().add(hBox);
        }
    }
}
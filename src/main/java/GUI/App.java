package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static GUI.ReadDataFromFile.*;

public class App extends Application {
    public static List<UserAccount> list = new ArrayList<>();
    public static List<Movie> listMovies = new ArrayList<>();
    public static List<Seat> listSeats = new ArrayList<>();

    @Override
    public void start(Stage stage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        Accounts user = readLoginInfo("login.xml");
        Movies movie = readMovieInfo("movie.xml");
        Movie seat = readSeatInfo("seat.xml");

        list.addAll(user.getAccounts());
        listMovies.addAll(movie.getMovies());
        listSeats.addAll(seat.getMovie());

        for (UserAccount s: user.getAccounts()) {
            System.out.println(s);
        }
        for (Movie s: movie.getMovies()) {
            System.out.println(s);
        }
        for (Seat s: seat.getMovie()) {
            System.out.println(s);
        }
        launch(args);
    }
}
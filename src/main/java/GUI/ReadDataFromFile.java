package GUI;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;



/**
 * FROM PJAIT GUI CLASS GROUP 21C LESSON - 11
 * @URL: https://dojo.pjwstk.edu.pl/en/gui/lesson-11
 *
 */
public class ReadDataFromFile {
    public static void main(String[] args) throws IOException {
        Accounts user = readLoginInfo("login.xml");
        Movies movie = readMovieInfo("movie.xml");
        Movie seat = readSeatInfo("seat.xml");

        for (UserAccount s: user.getAccounts()) {
            System.out.println(s);
        }
        for (Movie s: movie.getMovies()) {
            System.out.println(s);
        }
        for (Seat s: seat.getMovie()) {
            System.out.println(s);
        }
    }

    public static Accounts readLoginInfo(String pathFile) throws IOException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(new File(pathFile), Accounts.class);
    }

    public static Movies readMovieInfo(String pathFile) throws IOException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(new File(pathFile), Movies.class);
    }

    public static Movie readSeatInfo(String pathFile) throws IOException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(new File(pathFile), Movie.class);
    }
}
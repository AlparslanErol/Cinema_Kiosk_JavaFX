package GUI;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * FROM PJAIT GUI CLASS GROUP 21C LESSON - 11
 * @URL: https://dojo.pjwstk.edu.pl/en/gui/lesson-11
 *
 */
public class WriteDataToFile {

    public static void main(String[] args) throws IOException {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("No Country for Old Men, 2007","July 2, 2020","8pm","Ethan Coen, Joel Coen"," Tommy Lee Jones, Javier Bardem, Josh Brolin",8.1,"122 min","In rural Texas, welder and hunter Llewelyn Moss (Josh Brolin) discovers the remains of several drug runners who have all killed each other in an exchange gone violently wrong. Rather than report the discovery to the police, Moss decides to simply take the two million dollars present for himself. This puts the psychopathic killer, Anton Chigurh (Javier Bardem), on his trail as he dispassionately murders nearly every rival, bystander and even employer in his pursuit of his quarry and the money. As Moss desperately attempts to keep one step ahead, the blood from this hunt begins to flow behind him with relentlessly growing intensity as Chigurh closes in. Meanwhile, the laconic Sheriff Ed Tom Bell (Tommy Lee Jones) blithely oversees the investigation even as he struggles to face the sheer enormity of the crimes he is attempting to thwart. Written by Kenneth Chisholm (kchishol@rogers.com)","https://upload.wikimedia.org/wikipedia/tr/8/8b/No_Country_for_Old_Men_poster.jpg"));
        movies.add(new Movie("The Godfather, 1972","July 1, 2020","9pm","Francis Ford Coppola","Marlon Brando, Al Pacino, James Caan",9.2,"175 min","The Godfather \"Don\" Vito Corleone is the head of the Corleone mafia family in New York. He is at the event of his daughter's wedding. Michael, Vito's youngest son and a decorated WW II Marine is also present at the wedding. Michael seems to be uninterested in being a part of the family business. Vito is a powerful man, and is kind to all those who give him respect but is ruthless against those who do not. But when a powerful and treacherous rival wants to sell drugs and needs the Don's influence for the same, Vito refuses to do it. What follows is a clash between Vito's fading old values and the new ways which may cause Michael to do the thing he was most reluctant in doing and wage a mob war against all the other mafia families which could tear the Corleone family apart. Written by srijanarora-152-448595","https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg"));
        movies.add(new Movie("Star Wars, 1977","July 1, 2020","6pm","George Lucas","Mark Hamill, Harrison Ford, Carrie Fisher",8.6,"121 min","The Imperial Forces, under orders from cruel Darth Vader, hold Princess Leia hostage in their efforts to quell the rebellion against the Galactic Empire. Luke Skywalker and Han Solo, captain of the Millennium Falcon, work together with the companionable droid duo R2-D2 and C-3PO to rescue the beautiful princess, help the Rebel Alliance and restore freedom and justice to the Galaxy. Written by Jwelch5742","https://i.pinimg.com/originals/0a/3e/ab/0a3eabd19a2f926f4e9d61fac324e696.jpg"));
        movies.add(new Movie("Whiplash, 2014","July 3, 2020","8pm","Damien Chazelle","Miles Teller, J.K. Simmons, Melissa Benoist",8.5,"106 min","A young and talented drummer attending a prestigious music academy finds himself under the wing of the most respected professor at the school; one who does not hold back on abuse towards his students. The two form an odd relationship as the student wants to achieve greatness, and the professor pushes him. Written by andrewhodkinson","https://www.mauvais-genres.com/25970/whiplash-original-movie-poster-15x21-in-2015-damien-chazelle-miles-teller.jpg"));

        Movies gallery = new Movies(movies);
        movieToFile(gallery, "movie.xml");

        List<Seat> seats = new ArrayList<>();
        seats.add(new Seat(0,"",0,"",0,"",0,"",0,""));
        seats.add(new Seat(0,"",0,"",0,"",0,"",0,""));
        seats.add(new Seat(0,"",0,"",0,"",0,"",0,""));
        seats.add(new Seat(0,"",0,"",0,"",0,"",0,""));

        Movie movie = new Movie(seats);
        seatToFile(movie, "seat.xml");
    }

    public static void loginToFile(Accounts user, String pathToFile) throws IOException {
        XmlMapper mapper = new XmlMapper();
        String account = mapper.writeValueAsString(user);
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile));
        writer.write(account);
        writer.close();
    }

    public static void movieToFile(Movies movies, String pathToFile) throws IOException {
        XmlMapper mapper = new XmlMapper();
        String film = mapper.writeValueAsString(movies);
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile));
        writer.write(film);
        writer.close();
    }

    public static void seatToFile(Movie movie, String pathToFile) throws IOException {
        XmlMapper mapper = new XmlMapper();
        String film = mapper.writeValueAsString(movie);
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile));
        writer.write(film);
        writer.close();
    }
}
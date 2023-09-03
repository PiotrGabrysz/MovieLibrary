import org.models.MovieLibrary;
import utils.MenuHandler;
import utils.UserInputHandler;

import java.nio.file.attribute.UserPrincipal;

public class MovieLibraryApplication {
    public static void main(String[] args) {

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMoviesList();
        while(true){MenuHandler.print();
            switch (UserInputHandler.getMenuOptionFromUser()){
                case DISPLAYINFORMATIONABOUTRANDOMMOVIE :
                    movieLibrary.getRandomMovieInformation();
                    break;
                case DISPLAYACTORMOVIES:
                    movieLibrary.printActorFilmography();
                    break;
                case QUIT:
                    System.out.println("Bye bye!");
                    System.exit(1);
            }
        }

        //UserInputHandler userInputHandler = new UserInputHandler();


    }
}
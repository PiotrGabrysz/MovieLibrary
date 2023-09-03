import utils.MenuHandler;
import utils.UserInputHandler;

import java.nio.file.attribute.UserPrincipal;

public class MovieLibraryApplication {
    public static void main(String[] args) {

        //UserInputHandler userInputHandler = new UserInputHandler();

        MenuHandler.print();
        switch (UserInputHandler.getMenuOptionFromUser()){
            case DISPLAYINFORMATIONABOUTRANDOMMOVIE :
                //to do
                break;
            case DISPLAYACTORMOVIES:
                //to do
                break;
            case QUIT:
                System.out.println("Bye bye!");
                System.exit(1);
        }



    }
}
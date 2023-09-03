package utils;

import org.models.Actor;
import org.models.MenuOptions;

import java.util.Scanner;

public class UserInputHandler {
    static private Scanner scanner = new Scanner(System.in);
    public static MenuOptions getMenuOptionFromUser(){
        return MenuOptions.values()[getSelectedOptionFromUser() -1];
    }
    private static int getIntFromUser() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("It's not an integer. Try again!");
        }
        return scanner.nextInt();
    }

    private static int getSelectedOptionFromUser(){
        int result = getIntFromUser();
        scanner.nextLine();
        if(result > 0 && result < MenuOptions.values().length + 1){
            return result;
        }
        else{
            System.out.println("You were select not accepted option");
            return getSelectedOptionFromUser();
        }

    }
    public static Actor getActorFromUser() {
        System.out.println("Type an actor: ");
        String[] actors = scanner.nextLine().split(" ");
        return new Actor(actors[0], actors[1]);
    }
}

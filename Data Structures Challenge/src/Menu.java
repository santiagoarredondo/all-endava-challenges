import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    private static void printOptions(){
        System.out.println("Pelase choose an option:\n" +
                "1. Calculate the shortest path\n" +
                "2. Get the minimum spanning  tree\n" +
                "3. Load data from file (in/flights.txt)\n" +
                "3. Write results\n" +
                "4. Exit \n");
    }

    private static void sayHello(){
        System.out.println("\nWellcome to the app\n");
    }

    private static void menu(){
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
        }

    }

    public static void main(String[] args){
        sayHello();
    }
}

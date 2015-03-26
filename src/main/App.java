package main;

import calc.BinaryToInt;

import java.util.Scanner;

/**
 * Created by Chiggie on 3/25/2015.
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to someone's binary calculator.");

        menu(sc);

    }

    public static void menu(Scanner sc) {

        System.out.println("Options: \n");

        System.out.println("1. Convert binary to an integer.");
        System.out.println("2. Quit");

        System.out.println("\n> ");

        String choice = sc.nextLine().toLowerCase();

        switch(choice) {

            case "1":
                System.out.print("Please input some binary> ");

                String tempString = sc.nextLine();

                System.out.println("Your integer is: " + BinaryToInt.calc(tempString));
                menu(sc);
                break;
            case "2":
                System.out.println("Quitting...");
                break;
            case "3":
                System.out.println("Quitting...");
                break;
            default:
                System.out.println("That isn't a valid choice. \n");
                menu(sc);

        }

    }

}

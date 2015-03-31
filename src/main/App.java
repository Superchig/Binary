package main;

import calc.BinaryToInt;
import calc.IntToBinary;

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
        System.out.println("2. Convert integer to binary (EXPERIMENTAL)");
        System.out.println("3. Quit");

        System.out.print("\n> ");

        String choice = sc.nextLine().toLowerCase();

        switch(choice) {

            case "1":
                System.out.print("Please input some binary> ");
                String tempString = sc.nextLine();
                System.out.println("Your integer is: " + BinaryToInt.calc(tempString));
                menu(sc);
                break;
            case "2":
                System.out.println("Please input an unsigned integer> ");
                String inputString = sc.nextLine();
                int inputInt = stringToInt(inputString);
                System.out.println("Your binary is: " + IntToBinary.calc(inputInt));
                break;
            case "3":
                System.out.println("Quitting...");
                break;
            default:
                System.out.println("That isn't a valid choice. \n");
                menu(sc);

        }

    }

    public static int stringToInt(String input) {

        try {

            Integer transInteger = new Integer(input);
            int output = transInteger.intValue();
            return output;

        } catch (Exception e) {

            System.out.println("D'oh! That isn't an integer.");
            return -1;

        }


    }

}

package calc;

import java.util.Scanner;

/**
 * Created by Chiggie on 3/25/2015.
 */
public class BinaryToInt {

    public static void main(String[] args) {

        PowerOf2(0);

    }

    private static int outInt = 0;
    private static boolean validInt = true;

    public static int calc(String tempString) {

        validInt  = true;

        Character zero = new Character('0');
        Character one = new Character('1');

        outInt = 0;

        // System.out.println("tempString is: " + tempString);

        tempStringEvalLoop(tempString, zero, one);

        if (validInt) {
            return outInt;
        } else {
            return 0;
        }

    }

    public static int PowerOf2(int exponent) {

        int total = 2;

        if (exponent == 0) {

            total = 1;

        } else {

            for (int i = exponent; i > 1; i--) {

                total *= 2;

            }

        }

        return total;

    }

    public static boolean evalChars(Character char1, Character char2) {

        boolean evalution = char1.equals(char2);

        // System.out.println("The comparison of " + char1 + " and " + char2 + " is " + evalution);

        return char1.equals(char2);

    }

    private static void tempStringEvalLoop(String tempString, Character zero, Character one) {

        int backI = 0;
        Character valueOfI = new Character('A');

        for (int i = tempString.length() - 1; i > -1; i--) {

            backI = (tempString.length() - 1) - i;
            valueOfI = tempString.charAt(i);

            // System.out.println("backI is " + backI);

            int pow2Int = PowerOf2(backI);

            // System.out.println("PowerOf2(backI) is " + pow2Int);

            if (evalChars(one, valueOfI)) {

                outInt += pow2Int;

                // System.out.println("outInt is: " + outInt);

            } else if (evalChars(zero, valueOfI)) {

                // Well, 0 is added to outInt, which has no effect on it

            } else {

                System.out.println("You did not input valid binary. Returning 0.");

                outInt = 0;

                validInt = false;

            }


        }

    }

}

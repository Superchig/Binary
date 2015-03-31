package calc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Chiggie on 3/26/2015.
 */
public class IntToBinary {

    public static int calc(int input) {

        BigDecimal dividend = new BigDecimal(input);
        System.out.println("dividend is: " + dividend);
        BigDecimal remainder;
        // System.out.println("quotientAndRemainder is: " + quotientAndRemainder);

        BigDecimal divisor = new BigDecimal(2);
        BigDecimal array[];

        ArrayList<Character> stringArray = new ArrayList<>();

        while (dividend.intValue() > 0) {

            array = dividend.divideAndRemainder(divisor);
            // System.out.println("array[] is: " + array);

            dividend = array[0];
            System.out.println("Dividend is: " + dividend);

            remainder = array[1];
            System.out.println("remainder is: " + remainder);

            if (isAddChar(remainder.intValue())) {

                stringArray.add('1');

            } else {

                stringArray.add('0');

            }

        }

        Collections.reverse(stringArray);

        StringBuilder transAlA = new StringBuilder(stringArray.size());
        for (Character c: stringArray) {
            transAlA.append(c);
        }
        String transAlAS = transAlA.toString();
        Integer transAlAInteger = new Integer(transAlAS);
        int output = transAlAInteger.intValue();

        return output;
    }

    public static boolean isAddChar(int input) {

        boolean check1 = input == 1;
        boolean check0 = input == 0;

        if (check1) {

            return true;

        } else if (check0) {

            return false;

        } else {

            System.out.println("OH GOD WHAT HAVE YOU DONE. Seriously, though. This should never happen.");
            System.out.println("AKA: The test is broken. If you don't know what that means, good.");
            return false;

        }

    }

}

package Tests;

import calc.BinaryToInt;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by Chiggie on 3/26/2015.
 */
public class BinaryToIntTest {

    @Test
    public void PowerOf2Test() {
        assertTrue(BinaryToInt.PowerOf2(2) == 4);
        assertEquals(BinaryToInt.PowerOf2(4), 16);

    }

    @Test
    public void calcTest() {
        System.out.println("Beginning BinaryToInt.calc() test... \n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input binary> ");
        // String tempString = sc.nextLine();
        String tempString = "11001";

        System.out.println("\nPlease input expected equivalent> ");
        // String expected = sc.nextLine();
        String expected = "25";

        Integer tempInt = new Integer(expected);

        assertEquals(BinaryToInt.calc(tempString), tempInt.intValue());

        System.out.println("Test over.");

    }

}

package Tests;

import org.junit.Test;
import calc.IntToBinary;

/**
 * Created by Chiggie on 3/26/2015.
 */
public class IntToBinaryTest {

    @Test
    public void isAddCharTest() {

        org.junit.Assert.assertTrue(IntToBinary.isAddChar(1));
        org.junit.Assert.assertFalse(IntToBinary.isAddChar(0));

    }

    @Test
    public void calcTest() {

        int input = 35;
        int prediction = 100011;
        int output = IntToBinary.calc(input);
        System.out.println("output is: " + output);

        org.junit.Assert.assertTrue(output == prediction);

    }

}

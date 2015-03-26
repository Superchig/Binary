package Tests;

import org.junit.Test;
import calc.IntToBinary;

import java.util.List;

/**
 * Created by Chiggie on 3/26/2015.
 */
public class IntToBinaryTest {

    /*
    @Test
    public void calcTest() {

        System.out.println("Please input an integer> ");

        String tempString = "10";
        Integer tempInteger = new Integer(tempString);
        int tempInt = tempInteger.intValue();
        System.out.println("That integer was: " + tempInt);

        int tempBinary = IntToBinary.calc(tempInt);
        System.out.println("tempBinary is: " + tempBinary);

        org.junit.Assert.assertEquals("Yup. tempint and tempBinary are equivalent." ,tempInt, tempBinary);

    }
    */

    @Test
    public void PowerOf2SDuoTest() {

        System.out.println("Starting PowerOf2SDuoTest...");

        System.out.println("Please input integer> ");

        String tempString = "11";
        Integer tempInteger = new Integer(tempString);
        int tempInt = tempInteger.intValue();
        System.out.println("That integer was: " + tempInt);

        List<Integer> powerOf2sOutput = IntToBinary.ByPowerOf2S(tempInt);
        System.out.println("powerOf@sOutput is: " + powerOf2sOutput);

        int remainder = tempInt - IntToBinary.addUp(powerOf2sOutput);

        int cycle = tempInt + remainder;
        System.out.println("cycle is: " + cycle);

        org.junit.Assert.assertEquals(tempInt, cycle);

        System.out.println("Test ended... \n");

    }

    @Test
    public void highest2GeneratorTest() {

        System.out.println("Starting highest2GeneratorTest");

        System.out.println("Please input integer> ");

        String tempString = "10";
        Integer tempInteger = new Integer(tempString);
        int tempInt = tempInteger.intValue();
        System.out.println("That integer was: " + tempInt);

        org.junit.Assert.assertEquals(8, IntToBinary.highest2Generator(tempInt));

    }

}

package Tests;

import main.App;
import org.junit.Test;

/**
 * Created by Chiggie on 3/26/2015.
 */
public class AppTest {

    @Test
    public void stringToIntTest() {

        org.junit.Assert.assertEquals(App.stringToInt("35"), 35);

    }

}

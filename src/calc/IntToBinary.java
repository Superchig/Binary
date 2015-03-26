package calc;

import extra.Expa;

import java.util.*;

/**
 * Created by Chiggie on 3/26/2015.
 */
public class IntToBinary {

     public static int calc(int input) {

         return 0;
     }

    // Duo # 1
    public static List<Integer> ByPowerOf2S(int input) {

        List<Integer> divisorList = new ArrayList<>();
        int productOfPowerOf2 = 1;

        boolean useAssignedRem = input > 1;
        boolean inputIs0 = input == 0;
        boolean inputIs1 = input == 1;
        Iterator<Integer> tempIt = divisorList.iterator();
        int holdIt = 0;
        boolean keepIt;
        boolean endIt;

        if (useAssignedRem) {

            for (int i = input; i > 0; i--) {

                productOfPowerOf2 *= 2;
                Expa.printValue("productOfPower2", productOfPowerOf2);

                try {
                    holdIt += tempIt.next();
                } catch (NoSuchElementException e) {
                    holdIt += 0;
                } catch (ConcurrentModificationException e) {
                    holdIt += 0;
                }

                keepIt = productOfPowerOf2 + holdIt < input;
                endIt = productOfPowerOf2 + holdIt == input;

                if (keepIt) {
                    divisorList.add(productOfPowerOf2);
                } else if (endIt) {
                    divisorList.add(productOfPowerOf2);
                    i = 0;
                } else {
                    i = 0;
                }

            }

            holdIt += tempIt.next();
            Expa.printValue("divisorList", divisorList);

        } else if (inputIs0) {

            divisorList.add(0);

        } else if (inputIs1) {

            divisorList.add(1);

        } else {

            System.out.println("You seriously screwed something up. As in, 'Holy crap, I was never expecting anyone to " +
                    "see this message' kind of screwed up.");

            divisorList.add(-1);

        }

        return divisorList;

    }

    // Duo # 2
    public static int addUp(List<Integer> divisorList) {

        int total = 0;

        Iterator<Integer> tempIt = divisorList.iterator();

        for (int i: divisorList) {

            total += tempIt.next();

        }

        return total;
    }

    public static int highest2Generator(int input) {

        int power2 = 1;

        while (power2 < input) {

            power2 *= 2;

        }

        return power2 / 2;

    }

}

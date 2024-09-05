package demo;

import java.util.*;

public class longp {

    public static class BitInserter {

        public static List<Integer> insertBits(List<Integer> bits, int k) {

            List<Integer> result = new ArrayList<>();

            int consecutiveOnes = 0;



            for (int bit : bits) {

                if (bit == 1) {

                    consecutiveOnes++;

                    result.add(bit);

                    if (consecutiveOnes == k) {

                        result.add(0);

                        consecutiveOnes = 0;

                    }

                } else {

                    consecutiveOnes = 0;

                    result.add(bit);

                }

            }



            return result;

        }

    }



    public static void main(String[] args) {

        

        List<Integer> bits1 = new ArrayList<>(Arrays.asList(1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1));

        int k1 = 2;

        List<Integer> result1 = BitInserter.insertBits(bits1, k1);

        System.out.println(result1);



       

    }

}
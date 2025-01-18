package Problems;

import java.util.*;

public class SumOfDivided {
    public static String sumOfDivided(int[] l) {

        //find all prime dividers for l[] numbers

        Set<Integer> dividers = new HashSet<>(); //use set for no duplicates
        for (int number : l) {
            int temp = Math.abs(number);
            int divisor = 2;
            while (temp > 1) {
                if (temp % divisor == 0) {
                    dividers.add(divisor);
                    temp /= divisor;
                }
                else divisor++;
            }
        }

        //then sort set and save it as a list, cuz set does not preserve order
        List<Integer> dividersOrdered = dividers.stream().sorted().toList();

        //sum up l[] numbers by divisors and struct return string
        StringBuilder a = new StringBuilder();
        for (Integer divisor : dividersOrdered){
            int sum = 0;
            for (int number : l){
                if (number%divisor==0){
                   sum+=number;
                }
            }
            a.append("("+divisor);
            a.append(" ");
            a.append(sum+")");
        }
        return a.toString();
    }
}

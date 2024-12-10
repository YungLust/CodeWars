package Problems;

public class Multiples_of_3_5 {
    public static int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
//https://www.codewars.com/kata/514b92a657cdc65150000006

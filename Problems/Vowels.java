package Problems;

public class Vowels {
    private static final String vowels = "aeiou";

    public static int getCount(String str) {
        return (int) str.chars()
                        .filter(x -> vowels.chars().anyMatch(y -> x==y))
                        .count();
    }

}
//https://www.codewars.com/kata/54ff3102c1bad923760001f3
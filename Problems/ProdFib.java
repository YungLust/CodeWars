package Problems;

public class ProdFib { // must be public for codewars

    static private final double sqrt5 = Math.sqrt(5);
    static private final double fi = (1 + sqrt5) / 2;

    public static long[] productFib(long prod) {
        long[] ans = new long[3];
        long previous = 0;
        long current = 1;
        long res = 0;
        while (res < prod) {
            long temp = current;
            current += previous;
            previous = temp;
            res = previous * current;
        }
        ans[0] = previous;
        ans[1] = current;
        ans[2] = res == prod ? 1 : 0;
        return ans;
    }
    public static int mathFibonacci(int n) {
        return (int) Math.round(Math.pow(fi, n) / sqrt5);
    }

}
//https://www.codewars.com/kata/5541f58a944b85ce6d00006a/
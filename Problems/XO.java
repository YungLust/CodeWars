package Problems;

public class XO {

    public static boolean getXO (String str) {
        str=str.toLowerCase();
        long oCounter = str.chars()
                            .filter(x -> x == (int) 'o')
                            .count();

        long xCounter = str.chars()
                            .filter(x -> x == (int) 'x')
                            .count();

        System.out.println("X: "+xCounter+"\nO: "+oCounter);

        return oCounter == xCounter;
    }
}
//https://www.codewars.com/kata/55908aad6620c066bc00002a
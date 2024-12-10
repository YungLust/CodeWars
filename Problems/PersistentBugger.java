package Problems;

public class PersistentBugger {
    private static int counter; // you dont wanna declare it globally it will not reset

    public static int persistence(long n) {
        int counter = 0; // declare counter inside the method. So it is always 0 when is called.
        while (n/10 != 0) {
            int newN = 1;
            for (int i = getDigits(n); i > 0; i--) {
                int concreteDigit = (int) (n % Math.pow(10,i) / Math.pow(10,i-1));
                System.out.print("*"+concreteDigit);
                newN = newN * concreteDigit;
            }
            System.out.println(": "+newN);
            n=newN;
            counter++;
        }
        return counter;
    }

    public static int getDigits(long n) {
        int digitNumb = 0;
        while (n != 0) {
            n = n / 10;
            digitNumb++;
        }
        return digitNumb;
    }
}
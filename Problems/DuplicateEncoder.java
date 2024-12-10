package Problems;

import java.util.Arrays;

public class DuplicateEncoder {
    public static String encode(String word) {
        int length = word.length();
        word = word.toLowerCase();
        char[] encoded = new char[length];
        Arrays.fill(encoded,'(');
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j != i) {
                    if (word.charAt(i)==word.charAt(j)){
                        encoded[j] = ')';
                        encoded[i] = ')';
                    }
                }
            }
        }
        //regex to replace anything but ')' and '('
        return Arrays.toString(encoded).replaceAll("[^()]+", "");
    }
}

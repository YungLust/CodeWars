package Problems;

import java.util.Arrays;

public class EqualSidesOfArray {
    public static int findEvenIndex(int[] arr) {
        int result = -1;
        int leftSide = 0;
        int rightSide = 0;

        //sum up whole array
        rightSide = Arrays.stream(arr).sum();
        for (int i = 0; i < arr.length; i++){
            // subtract pointer from the right side
            rightSide -= arr[i];

            if (leftSide == rightSide){
                result = i;
                break;
            }

            //add pointer to the left side
            leftSide += arr[i];
        }
        return result;
    }
}
//https://www.codewars.com/kata/5679aa472b8f57fb8c000047
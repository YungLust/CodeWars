package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_diff {

    public static int[] ListSolution(int[] a, int[] b) {
        //create List to add elements from a that are absent in b
        List<Integer> intList = new ArrayList<>();
        for (int aEl : a){
            boolean skip = false;
            for (int bEl : b){
                if (aEl == bEl){
                    skip = true;
                    break;
                }
            }
            if (!skip){
                intList.add(aEl);
            }
        }

        //convert from List<Integer> to int[]
        int[] trans = new int [intList.size()];
        for (int i = 0 ;i < intList.size(); i++){
            trans[i] = intList.get(i);
        }
        return trans;
    }

    public static int[] StreamSolution(int[] a, int[] b){
        return Arrays
                .stream(a)
                //we filter elements by the values that noneMatch method returns
                //noneMatch returns true if there is no bEl that satisfy aEl == bEl condition
                .filter(aEl -> Arrays.stream(b).noneMatch(bEl -> aEl == bEl))
                .toArray();
    }
}
//https://www.codewars.com/kata/523f5d21c841566fde000009

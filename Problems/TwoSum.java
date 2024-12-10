package Problems;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j != i) {
                    if (numbers[i]+numbers[j]==target){
                        return new int[] {i,j};
                    }
                }
            }
        }
        return null;
    }
}
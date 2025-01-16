package Problems;

class RangeExtraction {

    public static String rangeExtraction(int[] arr) {

        StringBuilder result = new StringBuilder();
        int size = arr.length;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (i + 1 < size && arr[i] + 1 == arr[i + 1]) {
                counter++;
            }
            else if(counter==0){
                result.append(arr[i]).append(",");
            }
            else if (counter==1){
                result.append(arr[i-counter]).append(",");
                result.append(arr[i]).append(",");
                counter=0;
            }
            else {
                result.append(arr[i-counter]).append("-").append(arr[i]).append(",");
                counter=0;
            }
        }

        result.deleteCharAt(result.length()-1);
        System.out.println(result);

        return result.toString();
    }

}
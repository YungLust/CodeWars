package Problems;
import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> suicideOrder = new ArrayList<>();
        List<T> suicidals = new ArrayList<>(items);
        int i = 0;
        while (!suicidals.isEmpty()){
            i+=k-1;
            int size = suicidals.size();
            while (i >= size){
                i-=size;
            }
            suicideOrder.add(suicidals.get(i));
            suicidals.remove(i);
        }
        System.out.println(suicideOrder);
        return suicideOrder;
    }
}
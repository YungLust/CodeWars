package Problems;

import java.util.ArrayList;
import java.util.List;

public class Friend_Foe {
    public static List<String> friend(List<String> x){
        List<String> newList = new ArrayList<>();
        for (String name : x){
            if (name.length() == 4){
                newList.add(name);
            }
        }
        return newList;
    }
}
//https://www.codewars.com/kata/55b42574ff091733d900002f/

package Problems;

import java.util.*;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        List<Integer> result = new ArrayList<>();

        Set<String> recipeProducts = recipe.keySet();
        for (String product : recipeProducts) {
            if (available.containsKey(product)) {
                int availableAmount = available.get(product) / recipe.get(product);
                //System.out.println(available.get(product)+" / "+ recipe.get(product) +" = "+availableAmount);
                result.add(availableAmount);
            } else {
                return 0;
            }
        }

        //System.out.println(Arrays.toString(result.toArray()));

        Optional<Integer> cakesAmount = result.stream().min(Integer::compare);

        // I think this check can be redundant, but it would prevent from unexpected errors
        return cakesAmount.orElse(0);
    }
}
//https://www.codewars.com/kata/525c65e51bf619685c000059/
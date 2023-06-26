package com.foodgenerator;

import java.util.List;

public class FoodGeneratorApplicationStrater {
    public FoodGeneratorResult start() {
        FoodGenerator foodGenerator = new FoodGenerator();
        List<String> ingredients = List.of ("jajka", "mleko", "woda", "mąka", "sól");
        Recipe recipe = foodGenerator.findRecipe(ingredients);
        return new FoodGeneratorResult("Udało się:)", recipe.name());
    }
}

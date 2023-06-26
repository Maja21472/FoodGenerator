package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FoodGenerator foodGenerator = new FoodGenerator();
        List<String> ingredients ("jajka", "mleko", "woda", "mąka", "sól");
        foodGenerator.findRecipe(ingredients);
    }
}
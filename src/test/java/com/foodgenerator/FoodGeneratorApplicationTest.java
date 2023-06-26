package com.foodgenerator;

import org.junit.Test;

public class FoodGeneratorApplicationTest {
    @Test
    public void should_return_recipe_after_giving_5correct_ingredients(){
        FoodGeneratorResult  start = new FoodGeneratorApplicationStrater().start();
    }
}

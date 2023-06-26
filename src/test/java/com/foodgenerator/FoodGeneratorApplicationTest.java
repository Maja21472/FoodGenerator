package com.foodgenerator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class FoodGeneratorApplicationTest {
    @Test
    public void should_return_recipe_after_giving_5correct_ingredients(){
        FoodGeneratorResult result = new FoodGeneratorApplicationStrater().start();
        assertThat(result.message()).isEqualTo("Udało się:)");
        assertThat(result.recipe()).isEqualTo("naleśniki");
    }
}

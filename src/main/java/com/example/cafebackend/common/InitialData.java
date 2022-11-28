package com.example.cafebackend.common;

import com.example.cafebackend.Entity.Ingredient;
import com.example.cafebackend.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class InitialData {

    @Autowired
    IngredientRepository ingredientRepository;

    //@PostConstruct
    //comment or uncomment annotation if you want it to create those things
    public void initializeData(){
        Ingredient ingredient1 = new Ingredient("potato", 1.0,"kg");
        ingredientRepository.save(ingredient1);
        Ingredient ingredient2 = new Ingredient("carrot", 35.1,"kg");
        ingredientRepository.save(ingredient2);
        Ingredient ingredient3 = new Ingredient("cabbage", 21.0,"kg");
        ingredientRepository.save(ingredient3);
        Ingredient ingredient4 = new Ingredient("milk", 1.2,"l");
        ingredientRepository.save(ingredient4);
        Ingredient ingredient5 = new Ingredient("cacao", 1.5,"l");
        ingredientRepository.save(ingredient5);
        Ingredient ingredient6 = new Ingredient("banana", 1.9,"kg");
        ingredientRepository.save(ingredient6);
        Ingredient ingredient7 = new Ingredient("orange", 1.9,"kg");
        ingredientRepository.save(ingredient7);
        Ingredient ingredient8 = new Ingredient("eggplant", 1.9,"kg");
        ingredientRepository.save(ingredient8);
        Ingredient ingredient9 = new Ingredient("tomatoes", 1.9,"kg");
        ingredientRepository.save(ingredient9);
        Ingredient ingredient10 = new Ingredient("spinach", 1.9,"kg");
        ingredientRepository.save(ingredient10);
    }

}

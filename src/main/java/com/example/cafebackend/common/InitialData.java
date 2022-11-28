package com.example.cafebackend.common;

import com.example.cafebackend.Entity.Ingredient;
import com.example.cafebackend.Entity.IngredientPrice;
import com.example.cafebackend.Entity.User;
import com.example.cafebackend.Repository.IngredientPriceRepository;
import com.example.cafebackend.Repository.IngredientRepository;
import com.example.cafebackend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class InitialData {

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    IngredientPriceRepository ingredientPriceRepository;

    @Autowired
    UserRepository userRepository;

    @PostConstruct
    //comment or uncomment annotation if you want it to create those things
    public void initializeData(){

        //ingredients
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

        //ingredient price(date not working)
//        IngredientPrice ingredientprice1 = new IngredientPrice(123.0,11.1,"2022-12-20 01:00:00");
//        ingredientPriceRepository.save(ingredientprice1);


        //users
        User user1 = new User("admin","admin123","ADMIN");
        userRepository.save(user1);
        User user2 = new User("user","user123","USER");
        userRepository.save(user2);
    }

}

package com.example.cafebackend.Common;

import com.example.cafebackend.Entity.Ingredient;
import com.example.cafebackend.Entity.IngredientPrice;
import com.example.cafebackend.Entity.User;
import com.example.cafebackend.Repository.IngredientPriceRepository;
import com.example.cafebackend.Repository.IngredientRepository;
import com.example.cafebackend.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


//@Component
public class InitialData implements CommandLineRunner {

    IngredientRepository ingredientRepository;

    IngredientPriceRepository ingredientPriceRepository;

    UserRepository userRepository;


    public InitialData(IngredientRepository ingredientRepository, IngredientPriceRepository ingredientPriceRepository, UserRepository userRepository) {
        this.ingredientRepository = ingredientRepository;
        this.ingredientPriceRepository = ingredientPriceRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {
     Ingredient ingredient1 = new Ingredient("Abocado", "kg", 12.0);
     Ingredient ingredient2 = new Ingredient("Rice", "kg", 100.0);
     Ingredient ingredient3 = new Ingredient("Carrot", "kg", 18.0);
     Ingredient ingredient4 = new Ingredient("Orange", "kg", 150.0);
     Ingredient ingredient5 = new Ingredient("Spinach", "kg", 9.0);
     Ingredient ingredient6 = new Ingredient("Bread", "pcs", 10.0);


     ingredientRepository.save(ingredient1);
     ingredientRepository.save(ingredient2);
     ingredientRepository.save(ingredient3);
     ingredientRepository.save(ingredient4);
     ingredientRepository.save(ingredient5);
     ingredientRepository.save(ingredient6);


     User user1 = new User("Anjellie", "?", "Admin");
     User user2 = new User("Sajeta", "password", "Staff");
     User user3 = new User("Niraj", "niraj", "Admin");


     userRepository.save(user1);
     userRepository.save(user2);
     userRepository.save(user3);

     IngredientPrice ingredientPrice1 =new IngredientPrice(55.5, 10.5, LocalDate.of(2022,11,25));
     IngredientPrice ingredientPrice2 =new IngredientPrice(10.5, 7.5, LocalDate.of(2022,11,22));
     IngredientPrice ingredientPrice3 =new IngredientPrice(50.0, 17.5, LocalDate.of(2022,11,20));
     IngredientPrice ingredientPrice4 =new IngredientPrice(15.5, 15.5, LocalDate.of(2022,11,21));
     IngredientPrice ingredientPrice5 =new IngredientPrice(35.5, 10.0, LocalDate.of(2022,11,24));

     ingredientPriceRepository.save(ingredientPrice1);
     ingredientPriceRepository.save(ingredientPrice2);
     ingredientPriceRepository.save(ingredientPrice3);
     ingredientPriceRepository.save(ingredientPrice4);
     ingredientPriceRepository.save(ingredientPrice5);

    }

}

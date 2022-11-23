package com.example.cafebackend.Controller;

import com.example.cafebackend.Entity.Ingredient;
import com.example.cafebackend.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    IngredientRepository ingredientRepository;

    @GetMapping("/hi")
    public String sayHi(){
        return "hi";
    }

    @GetMapping("/ingredients")
    public List<Ingredient> getIngredients(){
        return ingredientRepository.findAll();
    }

    @PostMapping("/ingredients/add")
    public ResponseEntity<String> addIngredient(@RequestBody Ingredient ingredient){
        ingredientRepository.save(ingredient);
        return new ResponseEntity<>("added ingredient", HttpStatus.OK);
    }
}

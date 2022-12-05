package com.example.cafebackend.Common;

import com.example.cafebackend.Entity.Ingredient;
import com.example.cafebackend.Entity.IngredientPrice;
import com.example.cafebackend.Entity.MenuItem;
import com.example.cafebackend.Entity.User;
import com.example.cafebackend.Repository.IngredientPriceRepository;
import com.example.cafebackend.Repository.IngredientRepository;
import com.example.cafebackend.Repository.MenuItemRepository;
import com.example.cafebackend.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

//@Component
public class InitialData implements CommandLineRunner {

    IngredientRepository ingredientRepository;

    IngredientPriceRepository ingredientPriceRepository;

    UserRepository userRepository;

    MenuItemRepository menuItemRepository;


    public InitialData(IngredientRepository ingredientRepository, IngredientPriceRepository ingredientPriceRepository, UserRepository userRepository, MenuItemRepository menuItemRepository) {
        this.ingredientRepository = ingredientRepository;
        this.ingredientPriceRepository = ingredientPriceRepository;
        this.userRepository = userRepository;
        this.menuItemRepository = menuItemRepository;
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


        userRepository.save(user1);
        userRepository.save(user2);

        IngredientPrice ingredientPrice1 =new IngredientPrice(55.5, 10.5, LocalDate.of(2022,11,25),ingredient1);
        IngredientPrice ingredientPrice2 =new IngredientPrice(10.5, 7.5, LocalDate.of(2022,11,22),ingredient2);
        IngredientPrice ingredientPrice3 =new IngredientPrice(50.0, 17.5, LocalDate.of(2022,11,20));
        IngredientPrice ingredientPrice4 =new IngredientPrice(15.5, 15.5, LocalDate.of(2022,11,21));
        IngredientPrice ingredientPrice5 =new IngredientPrice(35.5, 10.0, LocalDate.of(2022,11,24));

        ingredientPriceRepository.save(ingredientPrice1);
        ingredientPriceRepository.save(ingredientPrice2);
        ingredientPriceRepository.save(ingredientPrice3);
        ingredientPriceRepository.save(ingredientPrice4);
        ingredientPriceRepository.save(ingredientPrice5);

        Set<Ingredient> set = new HashSet<Ingredient>();
        set.add(ingredient1);
        set.add(ingredient2);
        set.add(ingredient3);


        MenuItem humus = new MenuItem("Humus" ,"just do humus ezezez",set);
        menuItemRepository.save(humus);



//        MenuItem humus = new MenuItem("Humus","Humus", "");
//        MenuItem jackfruitAdobo = new MenuItem("Jackfruit Adobo","Jackfruit Adobo",
//                "1. Fry the garlic in the oil until the garlic becomes light brown \n" +
//                "2. Add the soy sauce, vinegar and sugar to the pot. Move until the sugar dissolves completely \n" +
//                "3. Add the jackfruit that has already drained .\n" +
//                "4. let the jackfruit boil and absorb the sauce. \n" +
//                "5. Move with spoon to obtain shredded jackfruit. Pack in boxes with date and stickers with its name \"adobo\"");
//        MenuItem tuna = new MenuItem("Tuna","Tuna", "");
//        MenuItem tunaVegan = new MenuItem("Tuna Vegan","Vegan Tuna",
//                "1. Drain the artichokes, prechop the basilicum\n" +
//                        "2. In the big food processor put all the ingredientes and process until you have a nice mouse consistency.\n" +
//                        "3. Pack in plastic 1 litre boxes and tag with the doate and \"vegan tuna\"");
//        MenuItem burgerPaddy = new MenuItem("Burger Paddy","Burger Paddy", "Put some checkpea into");
//        MenuItem caramalizedOnions = new MenuItem("Caramelized Onions","caramel", "Put some checkpea into");
//        MenuItem pickledOnions = new MenuItem("Pickled Onions","onions", "Put some checkpea into");
//        MenuItem roastedPortabelloMushrooms = new MenuItem("Roasted Portabello Mushrooms","mushrooms","Put some checkpea into");
//        MenuItem pickledCucumber = new MenuItem("Pickled Cucumber","cucumber","Put some checkpea into");
//        MenuItem pesto = new MenuItem("Pesto","pesto", "Put some checkpea into");
//        MenuItem crispFishPaddy = new MenuItem("Crisp Fish Paddy","fish",  "Put some checkpea into");
//        MenuItem creamyCoconutLentilCurry = new MenuItem("Creamy Coconut Lentil Curry","lentil", "Put some checkpea into");
//
//        menuItemRepository.save(humus);
//        menuItemRepository.save(tuna);
//        menuItemRepository.save(jackfruitAdobo);
//        menuItemRepository.save(tunaVegan);
//        menuItemRepository.save(burgerPaddy);
//        menuItemRepository.save(caramalizedOnions);
//        menuItemRepository.save(pickledOnions);
//        menuItemRepository.save(roastedPortabelloMushrooms);
//        menuItemRepository.save(pickledCucumber);
//        menuItemRepository.save(pesto);
//        menuItemRepository.save(crispFishPaddy);
//        menuItemRepository.save(creamyCoconutLentilCurry);
    }
}
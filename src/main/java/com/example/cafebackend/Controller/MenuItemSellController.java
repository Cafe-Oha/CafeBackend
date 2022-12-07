package com.example.cafebackend.Controller;

import com.example.cafebackend.Entity.Ingredient;
import com.example.cafebackend.Entity.MenuItemSell;
import com.example.cafebackend.Repository.IngredientRepository;
import com.example.cafebackend.Repository.MenuItemSellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/menu/sell")
@CrossOrigin
public class MenuItemSellController {

    @Autowired
    MenuItemSellRepository menuItemSellRepository;

    @GetMapping()
    public List<MenuItemSell> getMenuItemSells(){
        return menuItemSellRepository.findAll();
    }

    @GetMapping("/{id}")
    public MenuItemSell getMenuItemSellById(@PathVariable("id") Long id){
        return menuItemSellRepository.findById(id).orElseThrow(()-> new IllegalStateException("item sale with id="+id+" not found"));
    }

    @PostMapping()
    public ResponseEntity<String> addMenuSale(@RequestBody MenuItemSell object){
        menuItemSellRepository.save(object);
        return new ResponseEntity<>("added menu sale", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateMenuSale(@PathVariable("id") Long id, @RequestBody MenuItemSell object){
        object.setId(id);
        menuItemSellRepository.save(object);
        return new ResponseEntity<>("updated menu sale", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMenuSale(@PathVariable("id") Long id){
        menuItemSellRepository.deleteById(id);
        return new ResponseEntity<>("deleted menu sale", HttpStatus.OK);
    }

}

package com.example.cafebackend.Controller;


import com.example.cafebackend.Entity.Ingredient;
import com.example.cafebackend.Entity.MenuItem;
import com.example.cafebackend.Repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "/menu")
@CrossOrigin
public class MenuItemController {

    @Autowired
    MenuItemRepository menuItemRepository;

    @GetMapping()
    public List<MenuItem> getMenuItems(){
        return menuItemRepository.findAll();
    }

    @GetMapping("/{id}")
    public MenuItem getMenuItemById(@PathVariable("id") Long id){
        return menuItemRepository.findById(id).orElseThrow(()-> new IllegalStateException("menu with id="+id+" not found"));
    }

    @PostMapping()
    public ResponseEntity<String> addIngredient(@RequestBody MenuItem menuItem){
        menuItemRepository.save(menuItem);
        return new ResponseEntity<>("added menu item", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateIngredient(@PathVariable("id") Long id, @RequestBody MenuItem menuItem){
        menuItem.setId(id);
        menuItemRepository.save(menuItem);
        return new ResponseEntity<>("updated menu item", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteIngredient(@PathVariable("id") Long id){
        menuItemRepository.deleteById(id);
        return new ResponseEntity<>("deleted menu item", HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteIngredients(){
        menuItemRepository.deleteAll();
        return new ResponseEntity<>("deleted all menu items", HttpStatus.OK);
    }
}

package com.example.cafebackend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "menu_item")
public class MenuItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(length = 6000)
    private String instruction;

    @ManyToMany
    @JoinTable(
            name = "menu_ingredients",
            joinColumns = @JoinColumn(name = "menu_item_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private Set<Ingredient> menuIngredients = new HashSet<>();

    public MenuItem(String name, String instruction, Set<Ingredient> menuIngredients) {
        this.name = name;
        this.instruction = instruction;
        this.menuIngredients = menuIngredients;
    }
}
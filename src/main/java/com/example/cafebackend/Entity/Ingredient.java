package com.example.cafebackend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "unit")
    private String unit;

    @Column(name = "quantity")
    private Double quantity;

    @OneToMany
    @JoinColumn(name = "fk_ingredient_id", referencedColumnName = "id")
    private List<IngredientPrice> ingredientPrice;

    @ManyToMany (mappedBy = "menuIngredients")
    @JsonIgnore
    private Set<MenuItem> menuItems = new HashSet<>();
    public Ingredient(String name, String unit, Double quantity) {
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
    }

}
package com.example.cafebackend.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "IngredientPrice")
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "ingredient_price")
public class IngredientPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sell_price")
    private Double sellPrice;

    @Column(name = "buy_price")
    private Double buyPrice;

    @Column(name = "date")
    private Date date;


}

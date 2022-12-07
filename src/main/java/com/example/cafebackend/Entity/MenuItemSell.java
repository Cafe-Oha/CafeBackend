package com.example.cafebackend.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "menu_item_sell")
public class MenuItemSell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sell_price")
    private double sellPrice;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "amount_sold")
    private int amount_sold;

    @ManyToOne
    @JoinColumn(name = "fk_menu_item_id", referencedColumnName = "id")
    private MenuItem menuItem;
}

package com.ovammarket.etrade.entity.concrete;

import com.ovammarket.etrade.entity.abstracts.Entity;
import jakarta.persistence.*;


@jakarta.persistence.Entity
public class Product implements Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "stock_amount")
    private int stockAmount;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private boolean status;
}

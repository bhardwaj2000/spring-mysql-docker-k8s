package com.mks.mysql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "ORDER_TABLE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String orderName;
    private int qty;
    private double price;

}

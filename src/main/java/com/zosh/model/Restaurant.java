package com.zosh.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private User owner;


    private String name;

    private  String description;
    private String cuisineType;

    @OneToOne
    private Address address;

@Embedded
    private  ContactInformation contactInformation;

    private  String openingHours;

    private List<Order> orders=new ArrayList<>();
}

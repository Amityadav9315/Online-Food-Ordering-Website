package com.zosh.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;

    private String resturantname;
    private String systemname;

    private String bufferreader;
    private String datacollector;


    private String deliveryboy;

    private int  resturantcost;

    private int resturantcontactInformation;


    private int

}

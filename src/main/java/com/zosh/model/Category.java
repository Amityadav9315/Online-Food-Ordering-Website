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
    private String age;
    private int rollno;
    private String eduacation;
    private int  money;
    private int subject;

    private  String name;
    private String gap;
    private String group;



    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;

}

package com.zosh.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zosh.dto.RestaurantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.Order;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String email;

    private String password;

    private USER_ROLE role;

    @JsonIgnore
    @OneToMany
    private List<Order> orders=new ArrayList<>();
    private List<RestaurantDto>favorites=new ArrayList();

}

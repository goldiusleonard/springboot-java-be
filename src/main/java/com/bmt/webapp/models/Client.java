package com.bmt.webapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;
    
    private String phone;

}

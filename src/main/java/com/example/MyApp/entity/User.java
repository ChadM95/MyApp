package com.example.MyApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    //fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;

    //constructors
    public User() {}

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //getters - readable properties
    public Long getID() {return id;}
    public String getName() {return name;}
    public String getSurname() {return surname;}

    //setters
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}

    @Override
    public String toString() {
        return "id : " + id + " , " + "name : " + name + " , " + "surname: " + surname;
    }

}

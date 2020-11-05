package com.lambdaschool.javazoos.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "animal")
public class Animal extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;

    private String name;

    //one to many goes here
    @OneToMany(mappedBy = "animal",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    @JsonIgnoreProperties(value = "animals", allowSetters = true)
    private Set<Zooanimals> zoos = new HashSet<>();

    //required by JPA
    public Animal() {
    }

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    //Getters and Setters
    public long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(long animalid) {
        this.animalid = animalid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter and setter for zooanimals


    public Set<Zooanimals> getZoos() {
        return zoos;
    }

    public void setZoos(Set<Zooanimals> zoos) {
        this.zoos = zoos;
    }
}

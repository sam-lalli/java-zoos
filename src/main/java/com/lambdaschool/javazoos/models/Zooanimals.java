package com.lambdaschool.javazoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "zooanimals")
@IdClass(ZooanimalsId.class)
public class Zooanimals extends Auditable implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "animals")
    private Zoo zoo;

    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @JsonIgnoreProperties(value = "zoos")
    private Animal animal;

    public Zooanimals() {
    }

    public Zooanimals(Zoo zoo, Animal animal) {
        this.zoo = zoo;
        this.animal = animal;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zooanimals that = (Zooanimals) o;
        return ((this.getZoo() == null ? 0 : this.getZoo().getZooid()) ==
                (that.getZoo() == null ? 0 : that.getZoo().getZooid())) &&
                ((this.getAnimal() == null ? 0 : this.getAnimal().getAnimalid()) ==
                (that.getAnimal() == null ? 0 : that.getAnimal().getAnimalid()));
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

package com.lambdaschool.javazoos.models;


import java.io.Serializable;
import java.util.Objects;

public class ZooanimalsId implements Serializable {
    private long zoo;
    private long animal;

    public ZooanimalsId() {
    }

    public long getZoo() {
        return zoo;
    }

    public void setZoo(long zoo) {
        this.zoo = zoo;
    }

    public long getAnimal() {
        return animal;
    }

    public void setAnimal(long animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooanimalsId that = (ZooanimalsId) o;
        return getZoo() == that.getZoo() &&
                getAnimal() == that.getAnimal();
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

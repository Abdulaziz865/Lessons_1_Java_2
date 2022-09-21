package com.company;

public class Animal {
    private String name;
    private Shelter shelter;
    private Color nameEnum;

    public String getName() {
        return name;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public Color getNameEnum() {
        return nameEnum;
    }

    public Animal(String name, Shelter shelter, Color nameEnum) {
        this.name = name;
        this.shelter = shelter;
        this.nameEnum = nameEnum;

    }

    public String print() {
        return name + " " + getShelter().getShelter() + " " + nameEnum;
    }
}

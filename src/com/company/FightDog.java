package com.company;

public final class FightDog extends Dog {
    private String breed;

    public FightDog(String name,int age, Shelter shelter, Color nameEnum,  String breed) {
        super(name,age, shelter, nameEnum);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String print() {
        return super.print()+" " + breed;
    }
}

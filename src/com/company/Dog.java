package com.company;

public class Dog extends Animal {
    private int age;

    public Dog(String name, int age, Shelter shelter, Color nameEnum) {
        super(name, shelter, nameEnum);
        this.age = age;
    }

    public Dog(String name, Shelter shelter, Color nameEnum) {
        super(name, shelter, nameEnum);

    }

    public final void Dog(int age) {

        this.age = age;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String print() {
        return super.print() +" " + age;
    }
}


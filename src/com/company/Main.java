package com.company;

public class Main {
    public static void main(String[] args) {

        Shelter shelterForBobic = new Shelter("House");
        Shelter shelterForRex = new Shelter("House shelter");
        Shelter shelterForLia = new Shelter("Big House");

        Dog dog = new Dog("Bobic",23,shelterForBobic,Color.BLACK);
        System.out.println(dog.print());

        FightDog fightDog = new FightDog("Rex", 12,shelterForRex,Color.WHITE,"Haski");
        System.out.println(fightDog.print());

        FightDog fightDog2 = new FightDog("Lia", 2,shelterForLia,Color.RED,"Ovcharka");
        System.out.println(fightDog2.print());


    }

}

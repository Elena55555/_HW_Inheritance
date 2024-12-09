package org.example;

public class Skier extends Sportsman{
    public Skier(String name, String team, int age) {
        super(name, team, age);
    }


    public void  walkKilometer (){
        System.out.println("Walk 1 kilometer");
    }
}

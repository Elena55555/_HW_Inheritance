package org.example;

public class Footballer extends Sportsman{
    Footballer(String name, String team, int age) {
        super(name, team, age);
    }

    public void scoringGoals () {
        System.out.println("A football player scores a goal");
    }


}

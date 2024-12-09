package org.example;

public class HockeyPlayer extends Sportsman{
    HockeyPlayer(String name, String team, int age) {
        super(name, team, age);
    }


    public void scoringPucks (){
        System.out.println("A hockey player scores a goal");
    }

}

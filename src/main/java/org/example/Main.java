package org.example;

public class Main {
    public static void main(String[] args) {

         Footballer footballer = new Footballer("William", "Boston", 29);
         Footballer footballer1 = new Footballer("Mason", "Chicago", 38);

         HockeyPlayer hockeyPlayer = new HockeyPlayer("Ethan", "Hockeytown", 26);
         HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Jacob", "The Wings", 34);

         Skier skier = new Skier("Bob",  "The Spurs ", 23 );
         Skier skier1 = new Skier("Nick",   "The avant-garde", 16);


        System.out.println(footballer);
        System.out.println(footballer1);
        System.out.println(hockeyPlayer);
        System.out.println(hockeyPlayer1);
        System.out.println(skier);
        System.out.println(skier1);

        System.out.println("");
        System.out.println("Output of method actions");
        /** When we close the data and use private
         *  we have to use get methods.
         */

        footballer.train();
        footballer1.train();
        footballer.scoringGoals();
        footballer1.scoringGoals();

        System.out.println(footballer.getName());
        System.out.println(footballer.getTeam());
        System.out.println(footballer.getAge());
        System.out.println(footballer1.getName());
        System.out.println(footballer1.getTeam());
        System.out.println(footballer1.getAge());

        hockeyPlayer.train();
        hockeyPlayer1.train();
        hockeyPlayer.scoringPucks();
        hockeyPlayer1.scoringPucks();


        System.out.println(hockeyPlayer.getName());
        System.out.println(hockeyPlayer.getTeam());
        System.out.println(hockeyPlayer.getAge());
        System.out.println(hockeyPlayer1.getName());
        System.out.println(hockeyPlayer1.getTeam());
        System.out.println(hockeyPlayer1.getAge());

        skier.train();
        skier1.train();
        skier.walkKilometer();
        skier1.walkKilometer();

        System.out.println(skier.getName());
        System.out.println(skier.getAge());
        System.out.println(skier.getTeam());
        System.out.println(skier1.getName());
        System.out.println(skier1.getAge());
        System.out.println(skier1.getTeam());













    }
}
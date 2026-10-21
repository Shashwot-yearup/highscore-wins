package com.pluralsight;

import javax.swing.*;
import java.util.Scanner;

public class HighScoreWinsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// scanner to ask user for their input

        //ask the user for the game score
        System.out.print("Please enter a game score for ex: Home:Visitor|21:9");
        String score = scanner.nextLine().trim();

        String[] scorePart = score.split("\\|"); // Split by pipe

        //sout the first and second element.
        System.out.println(scorePart[0]);
        System.out.println(scorePart[1]);

        String[] teamName = scorePart[0].split(":"); // Split by :

        //Store the home team and visitor team in a variable
        String homeTeam = teamName[0];
        String visitorTeam = teamName[1];

        //gets the individual team score in their own array.
        String[] teamScore = scorePart[1].split(":"); // Split by :

        //store the individual teams in their own variable.
        int homeScore = Integer.parseInt(teamScore[0]);
        int visitorScore = Integer.parseInt(teamScore[1]);

        //if else statement to see who which side wins the game.
        if (homeScore > visitorScore) {
            System.out.println("Winner is " + homeTeam);
        }

        else if (visitorScore > homeScore) {
            System.out.println("Winner is " + visitorTeam);
        }

        else{
            System.out.println("It's a tie");
        }
        scanner.close(); //close the scanner.
    }
}

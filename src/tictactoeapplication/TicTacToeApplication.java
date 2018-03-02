/*
 * Copyright 2017 Stefan Vlahov
 */
package tictactoeapplication;

import java.util.Scanner;

/**
 *
 * @author stefanvlahov
 */
public class TicTacToeApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // Allows for cont. games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            System.out.println("Welcome To Tic Tac Toe!\n But first, pick the character you want to be and which character the AI will be!");
            System.out.println();
            System.out.println("Enter a single character that will represent you on the board!");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent on the board");
            char opponentToken = sc.next().charAt(0);
        }
            
    }
    
}

package Hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN\n"+
                "The game will be available soon.");
        String word = "java";
        System.out.println("HANGMAN");
        System.out.println("Guess the word: ");
        Scanner input = new Scanner(System.in);
        String ans = input.nextLine();
        if (ans.equals(word)) {
            System.out.println("You survived!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}

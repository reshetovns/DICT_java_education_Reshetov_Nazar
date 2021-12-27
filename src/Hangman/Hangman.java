package Hangman;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {


        String[] words_arr = {"java", "kotlin", "python", "javascript"};

        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(words_arr.length);
        String word = words_arr[randomInt];

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

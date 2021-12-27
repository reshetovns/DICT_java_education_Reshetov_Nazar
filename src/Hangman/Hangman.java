package Hangman;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;

public class Hangman {

    String[] words = {"java", "kotlin", "python", "javascript"};
    int lives = 8;
    String word = "";
    StringBuilder usedChars = new StringBuilder("");
    StringBuilder secretWord = new StringBuilder("");
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Hangman myGame = new Hangman();
        myGame.startGame();
    }



    public void startGame(){
        while (true) {
            System.out.println("HANGMAN");
            System.out.println("Type \"play\" to play the game or \"exit\" ");
            String choice = input.nextLine();
            if (Objects.equals(choice, "play")){
                setRandomWord();
                createSecretWord();
                while (true) {
                    if (lives == 0) {
                        System.out.println("You lost!");
                        break;
                    } else {
                        if (secretWord.indexOf("-") != -1) {
                            makeMove();
                        } else {
                            System.out.println(secretWord);
                            System.out.println("You win!");
                            break;
                        }
                    }
                }
                lives = 8;
                word = "";
                usedChars = new StringBuilder("");
                secretWord = new StringBuilder("");

            } else if (Objects.equals(choice, "exit")) {
                break;
            }
        }
    }

    public void makeMove() {
        System.out.printf("Guess the word %s:", secretWord);
        String choice = input.nextLine();
        if (checker(choice)) {
            usedChars.append(choice);
            if (!word.contains(choice)) {
                System.out.println("The letter doesn't appear in word");
                --lives;
            } else {
                updateSecretWord(choice);
            }
        }
    }

    public void setRandomWord() {
        Random myRandom = new Random();
        int randomInt = myRandom.nextInt(words.length);
        word = words[randomInt];
    }

    public void createSecretWord() {
        for (int i = 0; i < word.length(); i++) {
            secretWord.append('-');
        }
    }


    public void updateSecretWord(String choice) {
        int index = 0;
        while (index >= 0) {
            index = word.indexOf(choice, index);
            if (index >= 0) {
                secretWord.setCharAt(index, choice.charAt(0));
                ++index;
            }
        }
    }

    public Boolean checker (String choice) {
        Pattern p = Pattern.compile("[A-Za-z]");
        if (choice.length() != 1) {
            System.out.println("You should enter one letter");
            return false;
        }
        else if (!p.matcher(choice).matches()){
            System.out.println("You should enter only letters!");
            return false;
        }
        else if (usedChars.indexOf(choice) != -1){
            System.out.println("You already choose that letter");
            return false;
        }
        else {
            return true;
        }
    }
}
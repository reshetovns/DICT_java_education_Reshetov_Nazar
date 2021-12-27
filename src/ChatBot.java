package ChatBot;

import java.util.Scanner;

public class ChatBot {
    final static Scanner scanner = new Scanner(System.in);
    public static  void main(String[] args) {
        System.out.println("Hello! My name is Senpai");
        System.out.println("I was created in 2021");
        System.out.println("PLease, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int user_age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + user_age + "; that`s a good time to start programming!");

        {
            System.out.println("Now I will prove to you that I can count to any number you want.");
            int num = scanner.nextInt();
            for (int i = 0; i <= num; i++)
            {
                System.out.printf("%d!\n", i);
            }
            System.out.println("Let's test your knowledge of the facts");
            System.out.println("When was the Java language invented?");
            System.out.println("1. 1990\n"+
                    "2. 2022\n"+
                    "3. 1945\n"+
                    "4. 1986\n");
            while (true)
            {
                Scanner in = new Scanner(System.in);
                System.out.print("");
                int number = Integer.parseInt(in.next());

                if (number == 1)
                {
                    break;
                }
                else System.out.println("Please, try again.");
            }
            System.out.println("Great, you right!");
        }

    }
}
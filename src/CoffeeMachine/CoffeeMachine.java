package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int water_need = water / 200;
        int milk_need = milk / 50;
        int beans_need = beans / 15;

        int have = Math.min(water_need, Math.min(milk_need, beans_need));

        if (cups > have) {
            System.out.println("No, I can make only " + have + " cup(s) of coffee");
        } else if (cups == have) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            int extra = have - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + extra + " more than that)");
        }
    }
}
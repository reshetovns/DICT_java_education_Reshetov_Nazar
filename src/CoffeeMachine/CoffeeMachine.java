package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many cups of coffee you will need: ");
        int cup = scanner.nextInt();
        System.out.println("For " + cup + " of coffee you will need:");
        System.out.println(200 * cup + " ml of water");
        System.out.println(50 * cup + " ml of milk");
        System.out.println(15 * cup + " g of coffee beans");
    }
}
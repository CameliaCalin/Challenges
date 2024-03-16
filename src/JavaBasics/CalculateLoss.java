package JavaBasics;

import java.util.Scanner;

//Create a program to find the loss amount of a shop.
public class CalculateLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number for selling price:");

        int sellingPrice = input.nextInt();

        System.out.println("Please enter a number for cost price");

        int costPrice = input.nextInt();
        int loss = sellingPrice - costPrice;

        System.out.println("Your profit loss is : " + loss);

        input.close();
    }
}
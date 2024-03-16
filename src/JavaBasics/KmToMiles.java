package JavaBasics;

import java.util.Scanner;

/* Create a program to convert distance in kilometers to miles.

The formula to convert kilometers to miles is

miles = km / 1.6 */
public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pleas enter a value for km:");

        int km = input.nextInt();
        double miles = km / 1.6;


        System.out.println("Your conversion in miles is: " + miles);

    }

}
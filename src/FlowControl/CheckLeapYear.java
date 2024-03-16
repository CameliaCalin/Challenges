package FlowControl;

import java.util.Scanner;

/* Create a program to check if a year is a leap year or not.

A leap year is exactly divisible by 4 except for century years (years ending by 00). The century year is a leap year only if it is perfectly divisible by 400.

Get an integer year input for the year variable.
Use the if condition to check if the year is perfectly divisible by 400. If true, print Leap Year.
Use an else if condition to check if the year is perfectly divisible by 4 and doesn't end with 00 (not divisible by 100). If true, print Leap Year.
Otherwise, print Not a Leap Year. */

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {  // Use "and" (&&) for both conditions
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        input.close();
    }
}
package FlowControl;

import java.util.Scanner;

/*Create a program to find the youngest brother among 3 based on their ages.

Get integer age input for three brothers: jack, roman and johnny.
Compare the values of jack, roman and johnny.
If jack is the smallest, print Jack.
If roman is the smallest, print Roman.
If johnny is the smallest, print Johnny. */
public class FindYoungestBrother {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jack = input.nextInt();
    int roman = input.nextInt();
    int johnny = input.nextInt();

        if (jack < roman) {
            if (jack < johnny) {
                System.out.println("Jack ");
            } else {
                System.out.println("Johnny ");
            }
        } else {
            if (roman < johnny) {
                System.out.println("Roman");
            } else {
                System.out.println("Johnny ");
            }
        }

    input.close();
    }
}

package JavaBasics;

//Create a program to swap two numbers using a temporary variable.

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number for x value: ");

        int x = input.nextInt();

        System.out.println("Please enter a number for y value: ");

        int y = input.nextInt();
        //temporary variable
        int temp = x;
        x=y;
        y= temp;

        System.out.println(x);
        System.out.println(temp);

        input.close();
    }
}
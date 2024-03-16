package JavaBasics;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number for length:");

        int length = input.nextInt();

        System.out.println("Please enter a number for breath:");

        int breadth = input.nextInt();
        int area = length * breadth;

        System.out.println("Area of your rectangle is " + area);

        input.close();
    }
}
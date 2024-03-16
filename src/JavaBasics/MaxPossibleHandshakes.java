package JavaBasics;

import java.util.Scanner;

//Create a program to find the maximum number of handshakes among N number of students.
public class MaxPossibleHandshakes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value for number of students: ");

        int students = input.nextInt();
        int combination = (students * (students - 1)) / 2;

        System.out.println("Your maximum number of handshakes : "  + combination );

        input.close();

    }
}
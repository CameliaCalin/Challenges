package JavaBasics;

import java.util.Scanner;

//Create a program to convert weight in pounds to kilograms.
public class ConvertPoundToKg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an input for pound: ");

        double pound = input.nextInt();
        double kg = pound * 0.453592;

        System.out.println("Your conversion from pound to kg : " + kg);

        input.close();
    }
}
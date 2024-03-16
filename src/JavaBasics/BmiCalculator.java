package JavaBasics;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number for weight:");

        double weight = input.nextDouble();

        System.out.println("Please enter a number for height:");

        double height = input.nextDouble();
        double bmi = weight / (height * height);

        System.out.println("Your bmi:" + bmi);
        input.close();
    }
}
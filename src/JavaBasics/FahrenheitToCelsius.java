package JavaBasics;

import java.util.Scanner;

//Create a program to convert temperature in fahrenheit to celsius.
public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner  input = new Scanner(System.in);
        System.out.println("Please enter a value for your temperature in fahrenheit:");

        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Your conversion temperature from fahrenheit to celsius is:" + celsius);

        input.close();
    }
}
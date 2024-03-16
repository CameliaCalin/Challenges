package FlowControl;

import java.util.Scanner;

//** Create a program to print FizzBuzz based on user input.
//
//Get an integer input from the user and assign it to the number variable.
//If the number is a multiple of 3, print Fizz.
//If the number is a multiple of 5, print Buzz.
//If the number is a multiple of both 3 and 5, print FizzBuzz.
//Else print the original number.*/
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value for number: ");

        int number = input.nextInt();

        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(number % 3 == 0){
            System.out.println("Fizz");
        }else if(number % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(number);
        }

        input.close();
    }
}

package FlowControl;

import java.util.Scanner;

/*Create a program to check whether a number is prime or not.

A prime number is a number that is only divisible by either 1 or itself. For example, 7, 5, 19, etc.

Get an integer input for the variable number.
Create a flag variable with initial value 0.
Run a loop from 2 to number - 1 and check if number is divisible by any number between 2 to number - 1.
If the number is divisible, change the value of flag to 1 and break the loop.
Outside the loop, check if the value of flag is 1. If true, print Not a Prime Number. Otherwise, print Prime Number.*/
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int flag = 0;


        for(int i= 2; i<number; i++){
            if(number % i == 0 ){
                flag = 1;
                break;
            }

        }

        if (flag == 1) {
            System.out.println("Not a Prime Number");
        } else {
            System.out.println("Prime Number");
        }

        input.close();

    }
}

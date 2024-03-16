package FlowControl;

import java.util.Scanner;

/*Create a program to find the factorial of a number.

A factorial of a number N is the product of all numbers from 1 to N. For example,

Factorial of 6 = 6 * 5 * 4 * 3 * 2 * 1
Get an integer input for the variable number.
Initialize an integer variable factorial with value 1.
Run a for loop from i = 1 to i <= number.
Inside the loop, multiply factorial by i.
Print the value of factorial. */
public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int number =  input.nextInt();
        int factorial = 1;

        for (int i = 1; i<= number; i++){
            factorial *= i;
        }
        System.out.println(factorial);

        input.close();

    }
}

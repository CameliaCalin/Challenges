package FlowControl;

import java.util.Scanner;

/* Create a program to find the sum of N natural numbers.

Get an integer input for a variable n.
Run a loop from 1 to n.
Inside the loop, find the sum of all numbers from 1 to n.
Print the sum.*/
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int sum = 0;

    for (int i = 1; i<= n; i++){
        sum += i;
    }

        System.out.println(sum);

    input.close();
    }
}

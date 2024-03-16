package FlowControl;

import java.util.Scanner;

/* Get an integer input and store it in the number variable.
Run a while loop from 1 to 10.
Inside the loop, print the multiplication table in format: 8 * 1 = 8.*/
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int count = 1;

        while (count <= 10) {
            int result = number * count;
            System.out.println(number + " * " + count + " = " + result);
            count++;
        }
        input.close();
    }
}

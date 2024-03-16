package FlowControl;

import java.util.Scanner;

/*Create a program to find the sum of all the user inputs until the user enters 0.

Create an integer variable named sum with initial value 0.
Run a while loop that is always true.
Inside the loop, get an integer input value from the user and store it in a variable.
Check if the value is 0.
If the input value is 0, terminate the loop. Otherwise, add the input value to the sum variable.
Print the sum. */
public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
       int number;

        while(true){
            int userInput = input.nextInt();

            if(userInput == 0){
                break;
            }

            sum += userInput;
        }

        // print the sum
        System.out.println(sum);

        input.close();
    }
}
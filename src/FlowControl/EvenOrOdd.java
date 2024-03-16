package FlowControl;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}

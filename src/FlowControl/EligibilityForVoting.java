package FlowControl;

import java.util.Scanner;

/** Create a program to check the voting eligibility.

 Get age (integer) input and store it in the age variable.
 If age is greater than or equal to 18, he/she can vote.
 If the person can vote, print Can Vote. Otherwise, print Cannot Vote.
 */
public class EligibilityForVoting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter yout age: ");

        int age = input.nextInt();

        if (age >= 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You cany vote");
        }

        input.close();

    }
}

package FlowControl;

import java.util.Scanner;

/**Create a program to check if a student passed, failed, or entered invalid marks.

 Get integer input for marks.
 Check if the marks is less than 0 or greater than 100. If it's true, print Invalid Marks.
 Check if the marks is greater than 40. If it's true, print Pass.
 Else, print Fail. */

public class PassFailOrInavlid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please get onput value for marks: ");

        int marks = input.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks > 40){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}

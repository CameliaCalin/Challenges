package FlowControl;

import java.util.Scanner;

/**Create a program to find the bonus of employees based on their year of service.

 Zara decides to give a bonus of 5% to employees if their year of service is more than 5 years.
 Take salary and year of service in year as input.
 Print the bonus amount. */
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter values for salary and year of service: ");

        double salary = input.nextDouble();
        double serviceYear = input.nextDouble();

        if (serviceYear > 5){
            double bonus = ( 5 * salary) / 100;
            System.out.println(bonus);
        }
        input.close();
    }
}

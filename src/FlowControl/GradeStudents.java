package FlowControl;


import java.util.Scanner;

/* Create a program to find the grade of a student based on the marks.

Get a double input from the user and assign it to the marks variable.
Check the value of marks and assign grades based on that.
If marks is greater than or equal to 90, print A.
If marks is greater than or equal to 80, print B.
If marks is greater than or equal to 70, print C.
Otherwise, print D.*/
public class GradeStudents {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double marks = input.nextDouble();

      if (marks >= 90){
          System.out.println("A");
      }
      else if(marks >= 80){
          System.out.println("B");
      }
      else if(marks >= 70){
          System.out.println("C");
      }
      else{
          System.out.println("D");
      }

      input.close();
    }
=======

}

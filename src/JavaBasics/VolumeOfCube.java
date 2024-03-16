package JavaBasics;

import java.util.Scanner;

//Create a program to calculate the volume of a cube.
public class VolumeOfCube {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter a number for cube's length:");

        int length = input.nextInt();
        int volume = length * length * length;

        System.out.println("Your volume for your cube is" + volume);

        input.close();
    }
}

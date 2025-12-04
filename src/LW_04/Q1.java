package LW_04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out. print("Enter first number:");
        int first = scan.nextInt();
        System.out.print("Enter second number:");
        int second = scan.nextInt();
        System.out.print("Enter third number:");
        int third = scan.nextInt();

        int smallest = first;

        if(second < smallest){
            smallest = second;
        }
        if(third < smallest){
            smallest = third;
        }
        System.out.println("The smallest number is " + smallest);
    }
}

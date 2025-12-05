package LW_04;


import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // New line after each row
            System.out.println();
        }
    }
}

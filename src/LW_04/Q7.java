package LW_04;



import java.util.Scanner;

public class Q7 {

    // Method to count digits in an integer
    public static int countDigits(int num) {
        num = Math.abs(num); // handle negative numbers safely

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            int number = input.nextInt();

            if (number < 0) {
                System.out.println("Program stopped.");
                break;
            }

            int digits = countDigits(number);
            System.out.println("Number of digits: " + digits);
        }
    }
}

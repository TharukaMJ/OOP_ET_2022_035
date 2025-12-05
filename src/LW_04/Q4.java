import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("===== Welcome to MyJava Lo-Fat Burgers =====");


        double entreePrice = getEntreeChoice(input);
        double sidePrice = getSideChoice(input);
        double drinkPrice = getDrinkChoice(input);


        double total = entreePrice + sidePrice + drinkPrice;

        System.out.printf("\nYour Total Bill: $%.2f\n", total);
        System.out.println("Thank you for ordering!");
    }


    public static double getEntreeChoice(Scanner input) {
        System.out.println("\n--- Entree Menu ---");
        System.out.println("1. Tofu Burger     $3.49");
        System.out.println("2. Cajun Chicken   $4.59");
        System.out.println("3. Buffalo Wings   $3.99");
        System.out.println("4. Rainbow Fillet  $2.99");
        System.out.print("Choose your entree (1-4): ");

        int choice = input.nextInt();
        switch (choice) {
            case 1: return 3.49;
            case 2: return 4.59;
            case 3: return 3.99;
            case 4: return 2.99;
            default:
                System.out.println("Invalid choice! Defaulting to Tofu Burger.");
                return 3.49;
        }
    }


    public static double getSideChoice(Scanner input) {
        System.out.println("\n--- Side Dish Menu ---");
        System.out.println("1. Rice Cracker    $0.79");
        System.out.println("2. No-Salt Fries   $0.69");
        System.out.println("3. Zucchini        $1.09");
        System.out.println("4. Brown Rice      $0.59");
        System.out.print("Choose your side dish (1-4): ");

        int choice = input.nextInt();
        switch (choice) {
            case 1: return 0.79;
            case 2: return 0.69;
            case 3: return 1.09;
            case 4: return 0.59;
            default:
                System.out.println("Invalid choice! Defaulting to Rice Cracker.");
                return 0.79;
        }
    }


    public static double getDrinkChoice(Scanner input) {
        System.out.println("\n--- Drink Menu ---");
        System.out.println("1. Cafe Mocha   $1.99");
        System.out.println("2. Cafe Latte   $1.90");
        System.out.println("3. Espresso     $2.49");
        System.out.println("4. Oolong Tea   $0.99");
        System.out.print("Choose your drink (1-4): ");

        int choice = input.nextInt();
        switch (choice) {
            case 1: return 1.99;
            case 2: return 1.90;
            case 3: return 2.49;
            case 4: return 0.99;
            default:
                System.out.println("Invalid choice! Defaulting to Cafe Mocha.");
                return 1.99;
        }
    }
}

public class Q5 {
    public static void main(String[] args) {

        for (int i = 10; i <= 49; i++) {
            System.out.print(i + " ");

            // When the last digit is 9, move to a new line
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
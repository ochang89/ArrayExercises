import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        // Check if between 1 and 20
        while(running) {
            System.out.print("Enter an integer between 1 and 20: ");
            int n = input.nextInt();

            // Create list with n size
            int[] arr = new int[n];

            if (n > 0 && n <= 20) {

                // Assign each index of arr -> 2 to the power of i. From 0 to n
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) Math.pow(2, i);
                    System.out.println(arr[i]);
                }
            }
            else {
                System.out.println("Error: Enter an integer between 1 and 20.");
            }
            // Exit while loop, ending program
            running = false;
        }
    }
}

import java.util.Scanner;
import java.lang.Math;

public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int max = 75;
        int min = 2;
        int range = max - min + 1;

        while (running) {
            System.out.print("Enter integer n greater than 10: ");
            int n = input.nextInt();
            if (n <= 10) {
                continue;
            } else {
                int[] arr = new int[n];

                // Initialize array with random numbers
                for (int i = 0; i < arr.length; i++) {
                    int randNum = (int) (Math.random() * range) + min;
                    arr[i] = randNum;
                }
                // Print all elements same line
                System.out.println("\nBefore swap: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                // print sum of elements of indexes 2,5,7,9
                int[] arrIndex = {arr[2], arr[5], arr[7], arr[9]};
                // Call sumIndex method to sum array
                sumIndex(arrIndex);

                System.out.println("After swap: ");
                // swap elements 2 and 6
                int temp = arr[2];
                arr[2] = arr[6];
                arr[6] = temp;

                // swap elements 4 and 7
                int temp2 = arr[7];
                arr[7] = arr[4];
                arr[4] = temp2;

                // Print all elements of array again same line
                for(int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                // Create new array to update values after swap
                int[] arrIndex2 = {arr[2], arr[5], arr[7], arr[9]};
                // Print sum of elements at indexes 2, 5, 7, 9 again
                sumIndex(arrIndex2);
                running = false;
            }
        }
        }
    //method to sum array
    static void sumIndex(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.printf("\nSum of elements at indexes 2, 5, 7, 9 is: %d\n", sum);
    }
}


import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Collections;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        boolean running = true;

        while (running) {
            System.out.print("Enter integer n, greater than 0: ");
            int n = input.nextInt();

            if (n < 0) {
                // Restart loop if n is a negative number
                continue;
                }
            else {
                // Create arrays with n size
                int[] arr = new int[n];
                // ordered stores sorted ascending order array
                int[] ordered = new int[n];

                System.out.printf("Enter %d integers: ", n);
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = input.nextInt();
                    ordered[i] = arr[i];
                    sum += arr[i];
                }
                // Print each element from arr, on same line separated by spaces
                System.out.print("You entered: ");
                for (int i : arr) {
                    System.out.printf("%d ", i);
                }
                // Get last element of array
                int last = arr[arr.length - 1];



                // Reverse array
//                Integer[] arry = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//                Collections.reverse(Arrays.asList(arry));

                // sort array in ascending order
                Arrays.sort(ordered);

                // get and print max
                int max = ordered[ordered.length - 1];
                System.out.printf("\nMaximum value: %d", max);

                // get and print min
                int min = ordered[0];
                System.out.printf("\nMinimum value: %d", min);

                // get and print average
                double avg = (double) sum / ordered.length;
                System.out.printf("\nAverage: %f", avg);

                // Print all elements > avg
                System.out.println("\nElements greater than average:");
                for (int i = 0; i < ordered.length; i++) {
                    if (ordered[i] > avg) {
                        System.out.printf("%d ", ordered[i]);
                    }
                }
                // Print all elements > last element of arr
                System.out.printf("\nElements greater than %d:\n", last);
                for (int i = 0; i < ordered.length; i++) {
                    if (ordered[i] > last) {
                        System.out.printf("%d ", ordered[i]);
                    } else {
                        System.out.println("");
                        break;
                    }
                }
                // Print elements on same line in reverse order
                System.out.println("Array in reverse order:");
                for(int i = arr.length-1; i >= 0; i--){
                    System.out.printf("%d ",arr[i]);
                }

//                for (int i = 0; i < arr.length; i++) {
//                    System.out.printf("%d ", arr[i]);
//                }
            }
            break;
            }
    }
}

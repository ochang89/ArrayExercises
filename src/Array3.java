
public class Array3 {
    public static void main(String[] args) {
        int[] arr = {2,3,9,17,32,40,73,40,21,10};
        int temp = 0;

        // Print all elements of array
        System.out.println("Before shifting:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nAfter shifting:");
        // store initial value to move to last index
        temp = arr[0];

        // replace element to the left
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
            System.out.print(arr[i] + " ");
        }
        // replace last value with initial value
        arr[arr.length-1] = temp;
        System.out.println(arr[arr.length-1]);
        }

}

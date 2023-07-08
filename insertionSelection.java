import java.lang.reflect.Array;

public class insertionSelection {
    public static void main(String[] args) {

    }
/*
For the Insertion sort:
    •What is each loop responsible for?
        The for loop is responsible for going over everything in the array
        The while loop checks if the value is greater, and if so, we shift

    •Describe what’s happening instead of a swap.
        Instead of swapping the values, we are essentially shifting down the array and taking the valOfInterest and
        inserting it at the very front or indx = 0


For the Selection sort:
    •What is each for loop responsible for?
         The first for loop is responsible for the first number, while the second for loop is responsible
         for the number after the first number

    •Where is the swapping algorithm?
         Array.set(arr, min, arr[i]);
         Array.set(arr, i, temp);
         System.out.println(arr);

    •How does the swapping algorithm specifically work? (Is it using indexes, values, etc.)
        for example if we have the values a and b, we would need a third variable c. We will set c = a, a = b, and b = c
            a = 0; b = 1;
            c = a;
            a = b; b = c;
 */

    public static void insertionSrt(int[] arr){
        System.out.println(arr);
        int temp = 0;
        // Loops through entire array
        for(int i = 1; i < arr.length; i++){
            // The value we are comparing
            int valOfInterest = arr[i];
            // Index of the value we are going to shift to
            int position = i -1;
            // We are going to shift the array down to put the valOfInterest at indx = 0
            while(position >=0 && arr[position] > valOfInterest){
                Array.set(arr, position+1, position);
                System.out.println(arr);
                position--;
            }
            // If the value is not bigger we move the valOfInterest up
            Array.set(arr, position+1, valOfInterest);
            System.out.println(arr);
        }
    }

    public static void selectionSrt(int[] arr){
        System.out.println(arr);
        int temp = 0;
        // Loops through the entire array
        for(int i = 0; i < arr.length; i++){
            int min = i;
            // Using 2 for loops to compare two numbers
            for(int j = i+1; j<arr.length; j++){
                // if the number is smaller we set it equal to it
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // If our value has changed
            if(min != i){
                temp = arr[min];
                // We are switching the two values
                Array.set(arr, min, arr[i]);
                Array.set(arr, i, temp);
                System.out.println(arr);
            }
        }
        System.out.println(arr);
    }
}

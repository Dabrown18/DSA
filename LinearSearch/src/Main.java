import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    /*
        Given an array arr[] of n elements, write a function to search
        a given element x in arr[].
    */
    int[] arr;
    arr = new int[10];
    int selectedNumber;
    selectedNumber = 20;

    arr[0] = 25;
    arr[1] = 72;
    arr[2] = 36;
    arr[3] = 44;
    arr[4] = 19;
    arr[5] = 20;
    arr[6] = 82;
    arr[7] = 89;
    arr[8] = 43;
    arr[9] = 27;

    for ( int i = 0; i < arr.length; i++) {
        if ( selectedNumber == arr[i]) {
            System.out.println( selectedNumber + " is in the array!");
        }
    }

    // Arrange Array in ascending order
    int temp;

    for ( int i = 0; i < arr.length; i++) {
        for ( int j = i + 1; j < arr.length; j++ ) {
            if ( arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.print(arr[i] + " ");
    }

        System.out.println(" ");

    // Arrange Descending in descending order
    for ( int i = 0; i < arr.length; i++) {
        for ( int j = i + 1; j < arr.length; j++ ) {
            if ( arr[i] < arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.print(arr[i] + " ");
    }

    System.out.println(" ");

    // Binary Search


    }
}

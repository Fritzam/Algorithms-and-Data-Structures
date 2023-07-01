package BinarySearch;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // binary search = Search algorithm that finds the position of a
        //                 target value within a sorted array.
        //                 Half of the array is eliminated during each "step".

        int array[] = new int[100];
        int target = 42;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = Arrays.binarySearch(array, target);
        if (index == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Element found at: " + index);
        }
    }
}

package BinarySearch;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // binary search = Search algorithm that finds the position of a
        //                 target value within a sorted array.
        //                 Half of the array is eliminated during each "step".

        int array[] = new int[1000000000];
        int target = 7289434;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);
        if (index == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Element found at: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while(low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];
            System.out.println("Middle: " + value);
            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}

package firstQ;

import java.util.Arrays;

public class MergeSort implements SortStrategy {


    @Override
    public void sort(int[] arr) {
        if (arr.length < 2) {
            return; // Base case: if the array is size 1, it's already sorted
        }

        int mid = arr.length / 2; // Find the middle point
        int[] left = Arrays.copyOfRange(arr, 0, mid); // Divide the array into two halves
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        sort(left);  // Recursively sort the left half
        sort(right); // Recursively sort the right half

        merge(arr, left, right); // Merge the sorted halves
    }

    // Merge method to combine two sorted arrays
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the two arrays into arr
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy the remaining elements of left[], if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy the remaining elements of right[], if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    }


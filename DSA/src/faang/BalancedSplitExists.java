package faang;

import java.util.Arrays;

public class BalancedSplitExists {

    public static void main(String[] args) {
        // Test case to check if the balanced split exists
        System.out.println(balancedSplitExists(new int[] {1, 5, 7, 1})); // Expected output: true
    }

    // Function to check if a balanced split exists
    static boolean balancedSplitExists(int[] arr) {
        // Step 1: Sort the array
        // Sorting helps us to easily compare elements between two subarrays A and B
        Arrays.sort(arr);
        
        // Step 2: Calculate the total sum of the array
        // We need the total sum to check if it can be evenly split
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Step 3: If the total sum is odd, we can't split the array into two equal parts
        if (totalSum % 2 != 0) {
            return false;
        }

        // Step 4: Initialize sumA to store the sum of the first part (A)
        int sumA = 0;
        int length = arr.length;

        // Step 5: Traverse the array to find the splitting point
        for (int i = 0; i < length - 1; i++) {
            sumA += arr[i]; // Accumulate the sum for subarray A
            int sumB = totalSum - sumA; // Subarray B's sum is the remaining sum

            // Step 6: Check if the sum of A equals the sum of B and all elements in A are strictly smaller than those in B
            if (sumA == sumB && arr[i] < arr[i + 1]) {
                return true; // Balanced split exists
            }
        }

        // If no balanced split is found, return false
        return false;
    }
}

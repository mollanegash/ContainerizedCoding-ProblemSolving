package sorting;

import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) {

		printArray();

	}

	static void printArray() {
		Random random = new Random();
		int numbers[] = new int[10];
		int length = numbers.length;
		for (int i = 0; i < length; i++) {
			numbers[i] = random.nextInt(10);

		}
		int clonedArray[]=Arrays.copyOf(numbers, length);
		
		System.out.println("before Sorting");
		System.out.print("\n" + " " + Arrays.toString(clonedArray) + " ");
		// Perform Merge Sort
		mergeSort(clonedArray);

		System.out.println("\nAfter Sorting:");
		System.out.println(Arrays.toString(clonedArray));

	}

	static void mergeSort(int[] inputArray) {
		
		int inputLength = inputArray.length;
	
		if (inputLength < 2) {
			return;

		}

		int midPoint = inputLength / 2;
		// Use copyOfRange to handle odd/even sizes correctly
        int leftArray[] = Arrays.copyOfRange(inputArray, 0, midPoint); // First half
        int rightArray[] = Arrays.copyOfRange(inputArray, midPoint, inputLength); // Second half
		//or
		
//		int leftArray[] = new int[midPoint];
//		int rightArray[] = new int[inputLength - midPoint];
//		// Populate both arrays:
//		for (int i = 0; i < midPoint; i++) {
//			leftArray[i] = inputArray[i];
//
//		}
//		for (int i = midPoint; i < inputLength; i++) {
//			rightArray[i - midPoint] = inputArray[i];
//
//		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(inputArray, leftArray, rightArray);

	}


	private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
		// create pointers for both left, right, and the new sorted array!
		int i = 0, j = 0, k = 0;
		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] <= rightArray[j]) {
				inputArray[k++] = leftArray[i++];
				// i++;

			} else {
				inputArray[k++] = rightArray[j++];
				// j++;

			}
			// k++;
		}
		// Populate both arrays if left
		while (i < leftArray.length) {
			inputArray[k++] = leftArray[i++];
			// i++;
			// k++;

		}
		while (j < rightArray.length) {
			inputArray[k++] = rightArray[j++];
			// j++;
			// k++;

		}
		// k++;

	}

}

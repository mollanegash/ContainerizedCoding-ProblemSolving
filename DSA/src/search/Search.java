package search;

import java.util.Arrays;

public class Search {
	private static int array[] = { 1, 2, 3, 4, 56, 34 };
	private static int data = 34;

	public static void main(String[] args) {
		System.out.println(serialSearch(array, data));
		//sort this first
		Arrays.sort(array);
		System.out.println(iterBinSrch(array, data));
		int result = recBinSearch(array, data, 0, array.length - 1);

		if (result != -1) {
			System.out.println("Element" + " " + data + " " + "found at index" + " " + result);

		}
		System.out.println("Element" + " " + data + " " + "not found.");

	}

	static int serialSearch(int array[], int data) {
		int length = array.length;
		if (array == null || length == 0) {
			return -1;

		}

		for (int i = 0; i < length; i++) {
			if (array[i] == data) {
				return i;

			}

		}
		return -1;

	}

	static int iterBinSrch(int arr[], int data) {
		if (arr == null || arr.length == 0) {
			return -1;
		}

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2; // Avoid overflow

			if (arr[mid] == data) {
				return mid;
			} else if (arr[mid] > data) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1; // Return -1 if data is not found
	}

	static int recBinSearch(int arr[], int data, int low, int high) {

		if (arr == null || arr.length == 0) {
			return -1;
		}
		if (low > high) {
			return -1;

		}
		int mid = low + (high - low) / 2;
		if (arr[mid] == data) {
			return mid;

		} else if (arr[mid] > data) {
			return recBinSearch(arr, data, low, mid - 1);

		} else {
			return recBinSearch(arr, data, mid + 1, high);

		}

	}

}
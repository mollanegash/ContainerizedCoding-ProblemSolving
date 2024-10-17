package service_base_comp;


import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
	public static void main(String[] args) {
		findDuplicates(new int[] { 1, 2, 3, 1, 2, 4, 5, 4 });

	}

	static void findDuplicates(int nums[]) {
		HashSet<Integer> hSet = new HashSet<>();

		for (int num : nums) {
			if (!hSet.add(num)) {
				System.out.print("duplcate elemenets:"+ num + " ");

			}

		}

	}

}

package service_base_comp;

import java.util.ArrayList;
import java.util.List;

public class NeighborComparison {
	public static void main(String[] args) {
		int[] input = {1, 3, 2, 4, 1};
        System.out.println(getGreaterElements(input)); // Output: [3, 4]

		
	}
	
	static List<Integer> getGreaterElements(int arr[]){
		List<Integer>result=new ArrayList<>();
		int length=arr.length;
		for(int i=1;i<length;i++) {
			if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
				result.add(arr[i]);
				
			}
			
		}
		return result;
		
		
		
		
	}

}

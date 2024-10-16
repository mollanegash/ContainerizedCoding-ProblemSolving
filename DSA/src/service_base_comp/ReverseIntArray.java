package service_base_comp;

import java.util.Arrays;



public class ReverseIntArray {
	public static void main(String[] args) {
		int arrNums[]=reverseIntArray(new int[]{1,23,4,5,6,7,});
		System.out.println(Arrays.toString(arrNums));
		
		
	}
	
	
	
	static int[] reverseIntArray(int array[]) {
		int left=0;
		int right=array.length-1;
		while(left<right) {
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;
			left++;
			right--;
			//return array;
			
		}
	
		
		
		
		return array;
				
	}
	//or

	

}

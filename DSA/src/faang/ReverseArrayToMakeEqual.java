package faang;

import java.util.Arrays;

public class ReverseArrayToMakeEqual {
	public static void main(String[] args) {
		int[] array_a_1 = {1, 2, 3, 4};
	    int[] array_b_1 = {1, 4, 3, 2};
		boolean output = areTheyEqual(array_a_1,array_b_1);
		System.out.println(output);
		
	}
	
	  static boolean areTheyEqual(int[] array_a, int[] array_b) {
		    if(array_a.length!=array_b.length){
		      return false;
		}
		    Arrays.sort(array_a);
		    Arrays.sort(array_b);
		   
		   // return Arrays.equals(array_a,array_b);
		     //or
		    int length =array_a.length;
		    for(int i=0;i<length;i++){
		      if(array_a[i]!=array_b[i]){
		        return false;
		}
		      
		}
		    return true;
		    
		   
		    
		  }

}

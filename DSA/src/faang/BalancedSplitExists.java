package faang;

import java.util.Arrays;

public class BalancedSplitExists {
	
	public static void main(String[] args) {
		System.out.println(balancedSplitExists(new int[] {1,5,7,1}));
	
		
		
	}
	  static boolean balancedSplitExists(int[] arr) {
		    // Write your code here
		    
		    //sum of A[]+B[]equal and A[index]<B[index]
		    Arrays.sort(arr);
		    int totalSum=0;
		    for(int num:arr){
		      totalSum+=num;
		}
		       // If the total sum is odd, we can't split it into two equal parts
		        if (totalSum % 2 != 0) {
		            return false;
		        }
		        //sumA
		    int sumA=0;
		    int length=arr.length;
		    for(int i=0;i<length-1;i++){
		      sumA+=arr[i];
		      int sumB=totalSum-sumA;
		      if(sumA==sumB && arr[i]<arr[i+1]){
		        return true;
		}
		      
		  
		}
		    return false;
		    
		  }

}

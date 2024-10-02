package faang;
/**
 * Problem: Single Number
 *
 * Given an array of integers A, every element appears twice except for one. 
 * Your task is to find that single number.
 *
 * NOTE: Your algorithm should have a linear runtime complexity (O(n)). 
 * Could you implement it without using extra memory?
 *
 * Problem Constraints:
 * 1 <= |A| <= 2,000,000
 * 0 <= A[i] <= INT_MAX
 *
 * Input Format:
 * The input consists of an integer array A.
 *
 * Output Format:
 * Return a single integer denoting the single element.
 *
 * Example Input:
 * Input 1: A = [1, 2, 2, 3, 1]
 * Input 2: A = [1, 2, 2]
 *
 * Example Output:
 * Output 1: 3  // Explanation: 3 occurs once.
 * Output 2: 1  // Explanation: 1 occurs once.
 */
public class SingleNumber {
	public static void main(String[] args) {
		int arr[]={1,2,2,3,1};
		int arr1[]= {1,2,2};
		System.out.println(singleNumber(arr));
		System.out.println(singleNumber(arr1));
		
		
	}
	 /**
     * This method finds the single number in the given array.
     * 
     * @param A The input array of integers.
     * @return The single integer that appears only once in the array.
     */
	static public int singleNumber(final int[] A) {
        int len=A.length;
      int singleNum=0;
        for(int num:A){
            
           singleNum^=num;// Apply XOR operation. The property of XOR is that 
           // it cancels out numbers appearing twice.
            
            
        }
         return singleNum;
        
       
    }
}

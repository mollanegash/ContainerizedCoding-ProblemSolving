package faang;

import java.util.Arrays;

public class MileStone {
	
	public static void main(String[]args) {
		int revenues_1[] = {100, 200, 300, 400, 500};
        int milestones_1[] = {300, 800, 1000, 1400};
        int milestoneDays[]=getMilestoneDays(revenues_1,milestones_1);
        
		System.out.println(Arrays.toString(milestoneDays));
		
		
	}

   static  int[] getMilestoneDays(int[] revenues, int[] milestones) {
        int N = revenues.length;
        int K = milestones.length;
        int[] arrayOfDays = new int[K];
        
        int revenueSum = 0; // Cumulative revenue
        int milestoneIndex = 0; // Index to track which milestone we're checking

        Arrays.fill(arrayOfDays, -1); // Initialize all milestone days to -1

        // Iterate through each day's revenue
        for (int i = 0; i < N; i++) {
            revenueSum += revenues[i]; // Update cumulative revenue
            
            // Check milestones while the revenue is enough to meet them
            while (milestoneIndex < K && revenueSum >= milestones[milestoneIndex]) {
                // Only set the day if it hasn't been set already
                if (arrayOfDays[milestoneIndex] == -1) {
                    arrayOfDays[milestoneIndex] = i + 1; // Store the day (1-based index)
                }
                milestoneIndex++; // Move to the next milestone
            }
        }

        return arrayOfDays; // Return the result
    }

}

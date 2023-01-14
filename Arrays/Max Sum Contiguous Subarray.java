/*
Problem Description
Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.

Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000

Example Input
Input 1:

 A = [1, 2, 3, 4, -10] 

Example Output
Output 1: 10 
*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int n = A.length;
        int maxsum = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i=0; i<n; i++){
            current_sum += A[i];
            maxsum = Math.max(maxsum, current_sum);
            if(current_sum<0) current_sum=0;
        }
        return maxsum;
    }
}

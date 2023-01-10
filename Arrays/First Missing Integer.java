/*
Given an unsorted integer array, A of size N. Find the first missing positive integer.

Note: Your algorithm should run in O(n) time and use constant space.



Problem Constraints
1 <= N <= 1000000
-109 <= A[i] <= 109
Example Input
Input : [1, 2, 0]

Example Output
Output : 3
*/
public class Solution {
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        int i = 0;
        while(i<n){
            if(A[i]<=0 || A[i]>n || A[i] == i+1){
                i++;
            }
            else{
                int temp = A[i];
                if(A[i] == A[temp-1]){
                    i++;
                }
                else{
                    A[i] = A[temp-1];
                    A[temp-1] = temp;
                }
                
            }
        }

        for(int j = 0; j<n; j++){
            if(A[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }
}

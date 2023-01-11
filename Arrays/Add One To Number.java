/*
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

Problem Constraints
1 <= size of the array <= 1000000

Example Input
Input 1: [1, 2, 3]


Example Output
Output 1: [1, 2, 4]
*/

public class Solution {
    public int[] plusOne(int[] A) {
        int n = A.length; 
        int sum =0;
        boolean flag = true;
        for(int i=n-1; i>=0; i--){
            A[i]+=1;
            if(A[i]>9){
                A[i]=0;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag) {
            int[] arr = new int[n+1];
            arr[0] = 1;
            return arr;
        }
        int pos = 0;
        int count=0;
        while(A[pos] == 0){
            pos++;
            // count++;
        }
        if(pos>0){
            int[] res = new int[n-pos];
            for(int i=pos; i<n; i++){
                res[count++] = A[i];
            }
            return res;
        }
        return A;
    }
}

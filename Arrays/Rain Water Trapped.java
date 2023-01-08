/*
Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

Problem Constraints
1 <= |A| <= 100000

Example Input
Input 1:
A = [0, 1, 0, 2]
Example Output
Output 1: 1
*/

class Solution {
    public int trap(int[] height) {
        int l_max = 0;
        int r_max = 0;
        int i=0;
        int j = height.length-1;
        int result = 0;
        
        while(i<=j){
            if(height[i]<=height[j]){
                if(height[i]>=l_max){
                    l_max = height[i];
                }
                else{
                    result += l_max-height[i];
                }
                i++;
            }
            else{
                if(height[j]>=r_max){
                    r_max = height[j];
                }
                else{
                    result += r_max-height[j];
                }
                j--;
            }
        }
        return result;
    }
}

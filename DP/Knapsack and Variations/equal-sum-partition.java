/*
Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

https://leetcode.com/problems/partition-equal-subset-sum/

Input: [1, 5, 11, 5]

Output: true

Explanation: The array can be partitioned as [1, 5, 5] and [11].


*/


class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
       
        boolean dp[][] = new boolean[nums.length+1][sum/2+1];
        
         if(sum%2!=0) return false;
        
        else{
            for(int i=0;i<nums.length+1;i++)
                for(int j=0;j<sum/2+1;j++)
                    if(i==0) dp[i][j] = false;
                    else dp[i][j] = true;

            for(int i=1;i<nums.length+1;i++)
                for(int j=1;j<sum/2+1;j++){
                    if(nums[i-1]<=j){
                        dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                    }

                    else
                        dp[i][j] = dp[i-1][j];

                }
        }

            return dp[nums.length][sum/2];
    }
}

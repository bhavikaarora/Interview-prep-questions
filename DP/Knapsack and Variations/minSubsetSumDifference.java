/*
Given an integer array A containing N integers.

You need to divide the array A into two subsets S1 and S2 such that the absolute difference between their sums is minimum.

Find and return this minimum possible absolute difference.

https://www.interviewbit.com/problems/minimum-difference-subsets/

*/



public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i] = A.get(i);
            sum+=arr[i];
        }
        
        boolean x[][] = subsetSum(arr, sum);
        
        int min = Integer.MAX_VALUE;
        for(int j=0;j<=sum/2;j++){
            if(x[n][j]==true){
                if(min>sum-2*j)
                    min = sum-2*j;
            }
        }
        
        return min;
        
    }
    
    public boolean[][] subsetSum(int[] arr, int sum){
       
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0){
                    dp[i][j] = false;
                }
                if(j==0){
                    dp[i][j] = true;
                }
            }
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        
        return dp;
    }
    
}

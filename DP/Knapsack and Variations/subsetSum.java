/*
Given an array and a value n, return true or false depending upon whether there is any
subset in the array whose sum is n.


*/


class Solution{
 public int subsetSum(int[] arr, int sum){
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        //INITIALIZATION
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
        
        return dp[n][sum];
    }
    
}
}



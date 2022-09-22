class Solution {
    public int[] shuffle(int[] nums, int n) {
        int dp[] = new int[nums.length];
        // int y = n;
        int c=0;
        for(int i=0;i<n;i++){
            dp[c++] = nums[i];
            dp[c++] = nums[i+n];
            
            // dp[i] = nums[i];
            // // if( i%2 == 0){
            // //     dp[i] = nums[i];
            // // }
            // // else{
            // //     dp[i] = nums[i+2];
            // // }
            // i = i+1;
        }
        return dp;
        
    }
}
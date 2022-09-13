class Solution {
    public int jump(int[] nums) {
        //Most Important
        
        // if(nums.length == 1 || nums == null){
        //     return 0;
        // }
        // int min = 1;
        // int arr[] = new int[nums.length];
        // arr[nums.length-1] = 0;
        // for(int i =nums.length-2;i>=0;i--){
        //    if((nums[i]+i) == (nums.length-1)){
        //        arr[i] = 1;
        //    }
        //     else{   
        //     }   
        // }
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int min = Integer.MAX_VALUE;
            for(int j=i+1;j<=Math.min(n-1,i+nums[i]);j++){
                min = Math.min(min,dp[j]);
            }
            if(min != Integer.MAX_VALUE){
                dp[i] = min+1;
            }
        }
        return dp[0];
        
        
    }
}
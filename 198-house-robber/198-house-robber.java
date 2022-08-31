class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0 || nums == null){
            return 0;
        }
        if(n == 1){
            return nums[0];
        }
        if(n == 2){
            return Math.max(nums[0],nums[1]);
            
        }
        int dp[] = new int[n];
        dp[0]= nums[0];
        dp[1] = Integer.max(nums[0],nums[1]);
        for(int i =2 ; i<n;i++){
            dp[i] = Integer.max(nums[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
        
//         int count =0;
//         int n = nums.length;
//         // if(n==2){
//         //     return nums[1];
//         // }
        
//         for(int i = 0; i<n;i++){
//             count= count + nums[i];
//             i++;
//         }
//         int count1=0;
//         for(int i=1;i<n;i++){
//             count1= count1+nums[i];
//             i++;
//         }
//         if(count>count1){
//             return count;
//         }
//         else{
//             return count1;
//         }
        
    }
}
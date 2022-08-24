class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        // jump Location == Index + Value
        int n = nums.length;
        int max = 0;
        for(int index = 0;index<n-1 && max>=index; index++){
            if(max<index + nums[index]){
                max = index + nums[index];
            }
            if(max >= n-1){
                return true;
            }
            
        }
        return false;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
//         int j=0;
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){
//             // for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[i-1]){
                    return true;
                    
                }
            
        }
        return false;
    }
}
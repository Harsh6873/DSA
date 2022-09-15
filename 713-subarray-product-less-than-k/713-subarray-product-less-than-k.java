class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        if(len<=1)
            return 0;
        int count=0;
        for(int i =0;i<len;i++){
            int product = nums[i];
            if(product < k){
                count++;
            }
            for(int j=i+1;j<len&&product<k;j++){
                product *= nums[j];
                if(product<k){
                    count++;
                }
            }
        }
        return count;
    }
}
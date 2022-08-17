class Solution {
    public void sortColors(int[] nums) 
    {
        // int zeroes = 0;
        // int ones = 0;
        // int two = 0;
        int n = nums.length;
        int low = 0 , mid =0;
        int high = n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }

        }
        
        
    }
    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
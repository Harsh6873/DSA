class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j = i+1;j< nums.length;j++){
        //         if(nums[j] == target - nums[i]){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return null;   
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            else{
                map.put(nums[i],i);
            }
            
        }
        throw new IllegalArgumentException("No two Sum solution");
    }
}
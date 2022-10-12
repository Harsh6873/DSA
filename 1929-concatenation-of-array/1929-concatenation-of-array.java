class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ss[] = new int[2*n];
        for(int i =0;i<n;i++){
            ss[i] = nums[i];
            ss[i+n] = nums[i];
        }
        return ss;
        
    }
}
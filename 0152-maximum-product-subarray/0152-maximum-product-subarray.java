class Solution {
    public int maxProduct(int[] nums) {
//         int max = 0;
//         int maxPro = 0;
//         for(int i=0;i<nums.length;i++){
           
//             }
//         }
        int n = nums.length;
        int left=1,right=1;
        int ans=nums[0];
        
        for(int i=0;i<n;i++){
            
			//if any of l or r become 0 then update it to 1
            left = left==0 ? 1 : left;
            right = right==0 ? 1 : right;
            
            left *= nums[i];   //prefix product
            right *= nums[n-1-i];    //suffix product
            
            ans = Math.max(ans,Math.max(left,right));
            
        }
        
        return ans;
        
    }
}
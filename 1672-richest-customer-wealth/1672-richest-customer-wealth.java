class Solution {
    public int maximumWealth(int[][] accounts) {
        int count=0 ;
        for(int i = 0 ;i<accounts.length;i++){
            int count1=0;
            for(int j= 0 ;j<accounts[0].length;j++){
                count1 += accounts[i][j];
            }
            count = Math.max(count1,count);
        }
        return count;
    
    }
}
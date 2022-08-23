class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
//         char ch[] = jewels;
//         int m = ch.length;
        
//         int n = stones.length;
//         for(int i =0; i<m ;i++){
//             for()
//         }
        for(char j: jewels.toCharArray()){
            for(char s: stones.toCharArray()){
                if(s == j){
                    res ++;
                }
            }
        }
        return res;
    }
}
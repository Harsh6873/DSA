class Solution {
    public int minDistance(String word1, String word2) {
        char str[] = word1.toCharArray();
        char str1[] = word2.toCharArray();
        int dp[][] = new int[str.length+1][str1.length+1];
       
//         for(int i=1;i<str.length;i++){
//             
//             for(int j=1;j<=str1.length;j++){
//                 if(i==0 || j==0){
//                     dp[i][j] = count++; 
//                 }
//                 else{
//                     dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1])) + 1;
//                 }
//             }
            
//         }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = i;
        }
        for(int i=0;i<dp.length;i++){
            dp[i][0] = i;
        }
        for(int i=1;i<=str.length;i++){
            for(int j=1;j<=str1.length;j++){
                if(str[i-1] == str1[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1+ min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[str.length][str1.length];
    }
    int min(int a, int b, int c){
        int l = Math.min(a,b);
        return Math.min(l,c);
    }
}
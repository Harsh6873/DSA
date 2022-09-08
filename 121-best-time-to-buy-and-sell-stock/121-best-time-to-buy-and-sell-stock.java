class Solution {
    public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int buy[] = new int[n];
//         int sell[] = new int[n];
//         buy[0] = prices[0];
//         for(int i=1;i<n;i++){
//             buy[i] = Math.min(buy[i-1],prices[i]);
//         }
//         sell[n-1] = prices[n-1];
//         for(int i=n-2;i>=0;i--){
//             sell[i] = Math.max(sell[i+1],prices[i]);
            
//         }
//         int max=0;
//         for(int i=0;i<n;i++){
//             max = Math.max(max,sell[i] - buy[i]);
//         }
        
//         return max;
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < minPrices){
                minPrices = prices[i];
                
            }
            maxProfit = Math.max(prices[i]-minPrices,maxProfit);
            
        }
        return maxProfit;
    }
}
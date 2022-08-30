class Solution {
    public int change(int amount, int[] coins) {
        int n = amount+1;//6
        int arr[] = new int[n];//arr[6]
        // Arrays.fill(arr,0);
        arr[0]=1;
        // for(int i =0;i<n;i++){
        //     // int amo=i+1;
        //     // if( amo >= coins[i]){
        //     //     arr[amo] = arr[amo-coin];
        //     // }
        // }
        for(int coin:coins){
            for(int i=coin;i<amount+1;i++){
                arr[i] += arr[i-coin];
            }
        }
        return arr[amount];
        
    }
}
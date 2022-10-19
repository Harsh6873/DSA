class Solution {
    public boolean isSameAfterReversals(int num) {
        // if(num == 0){
        //     return true;
        // }
        if(num%10==0 && num!=0){
            return false;
        }
        return true;
        
        
        // long rev =0;
        // long se =0;
        // while(num>0){
        //     rev = rev*10 + (num%10);
        //     num = num/10;
        // }
        // long re = rev;
        // while(re>0){
        //     se = se*10 + (re%10);
        //     re /= 10;
        // }
        // if(rev == se)
        //     return true;
        // else{
        //     return false;
        // }
        // if(re == se){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        
    }
}
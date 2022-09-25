class Solution {
    public int climbStairs(int n) {
        int Stairs[] = new int[n+1];
        Stairs[0] = 1;
        Stairs[1] = 1;
        for(int i=2;i<=n;i++){
            Stairs[i] = Stairs[i-1] + Stairs[i-2];
        }
        return Stairs[n];
    }
}
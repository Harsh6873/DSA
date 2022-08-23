class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        int min = salary[0];
        int max = salary[n-1];
        double avg = 0;
        double sum = 0;
        for(int i =0 ; i<n;i++){
            sum = sum + salary[i];
        }
        avg = (sum - (min+max))/(n-2);
        return avg;
        
        
    }
}
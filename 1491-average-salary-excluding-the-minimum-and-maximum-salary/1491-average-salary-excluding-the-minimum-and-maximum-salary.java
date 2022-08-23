class Solution {
    public double average(int[] salary) {
        // Arrays.sort(salary);
        // int n = salary.length;
        // int min = salary[0];
        // int max = salary[n-1];
        // double avg = 0;
        // double sum = 0;
        // for(int i =0 ; i<n;i++){
        //     sum = sum + salary[i];
        // }
        // avg = (sum - (min+max))/(n-2);
        // return avg;
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        for(int i =0; i<salary.length; i++){
            minSalary = Math.min(minSalary,salary[i]);
            maxSalary = Math.max(maxSalary,salary[i]);
        }
        double sum =0;
        for(int i =0; i<salary.length ;i++){
            if(minSalary != salary[i] && maxSalary != salary[i]){
                sum = sum+salary[i];
            }
        }
        return sum/(salary.length -2);
        
        
    }
}
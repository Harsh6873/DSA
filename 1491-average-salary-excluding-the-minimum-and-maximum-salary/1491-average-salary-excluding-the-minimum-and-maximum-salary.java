class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<salary.length;i++){
            max = Math.max(salary[i], max);
            min = Math.min(salary[i],min);
        }
        double sum =0;
        for(int i=0;i<salary.length;i++){
            if(salary[i] != max && salary[i] != min){
                sum =sum+salary[i];
            }
        }
        return sum/(salary.length-2);
    }
}
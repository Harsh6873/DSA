class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digit = "123456789";
        List<Integer> list = new ArrayList<Integer>();
        for(int i =1 ;i<=9;i++){
            for(int j =0 ;j+i <= digit.length();j++){
                String substring = digit.substring(j,i+j);
                int value = Integer.parseInt(substring);
                if(value >= low && value <= high){
                    list.add(value);
                }
            }
        }
        return list;
    }
}
    
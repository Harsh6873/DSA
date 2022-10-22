class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int p=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].contains("++"))
                p++;
            else if(operations[i].contains("--"))
                p--;
            else
                continue;
        }
        return p;
    }
}
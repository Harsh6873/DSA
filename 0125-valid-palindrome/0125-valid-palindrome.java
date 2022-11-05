class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
//         String str = s.toLowerCase();
//         str = str.replaceAll("\\s", "");
//         str = str.replaceAll(":","");
//         str = str.replaceAll(",","");
//         for(int i=0;i<=str.length()/2;i++){
//             char start = str.charAt(i);
//             char end = str.charAt(str.length()-1-i);
            
//             if(start != end){
//                 return false;
//             }
//         }
//         return true;
    }
}
class Solution {
    public String restoreString(String s, int[] indices) {
        char Str[] = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            Str[indices[i]] = s.charAt(i);
            
        }
        return new String(Str);
    }
}
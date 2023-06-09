//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends

class Solution {
    public List<String> find_permutation(String S) {
        List<String> ans = new ArrayList<>();
        char[] chs = S.toCharArray();
        Set<String> set = new HashSet<>();
        backtrack(chs, 0, set);
        
        for (String s : set) {
            ans.add(s);
        }        
        
        Collections.sort(ans);
        return ans;
    }
    
    private void backtrack(char[] chs, int index, Set<String> set) {
        if (index >= chs.length) return;
        
        for (int i=index; i < chs.length; i++) {
            swap(chs, i, index);
            backtrack(chs, index + 1, set);
            swap(chs, i, index);
            
            set.add(new String(chs));
        }
    }
    
    private void swap(char[] chs, int i, int j) {
        char temp = chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }
}


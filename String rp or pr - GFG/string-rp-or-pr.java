//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        
        int t = Integer.parseInt(br.readLine()); 

        while(t > 0){
            
            String input_line1[] = br.readLine().trim().split("\\s+");
            int X = Integer.parseInt(input_line1[0]);
            int Y = Integer.parseInt(input_line1[1]);
            
            String S = br.readLine(); 
            
            Solution ob = new Solution();
		
            System.out.println(ob.solve(X,Y,S)); 

            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static long solve(int X,int Y, String S)
	{    
        Stack<Character> stk1 = new Stack<>();
	    Stack<Character> stk2 = new Stack<>();
	    long p = 0, r = 0;
	    stk1.push(S.charAt(0));
	    char temp = S.charAt(0);
	    if(X > Y){
	      for(int i = 1; i < S.length(); i++){
	          char ch = S.charAt(i);
	          if(!stk1.isEmpty() && (ch == 'r' && stk1.peek() == 'p')){
	              stk1.pop();
	              p++;
	          }
	          else{
	              stk1.push(ch);
	          }
	      }
	      stk2.push(stk1.pop());
	      temp = stk2.peek();
	      while(!stk1.isEmpty()){
	          if(!stk2.isEmpty() && (stk1.peek() == 'r' && stk2.peek() == 'p')){
	              stk1.pop();
	              r++;
	              stk2.pop();
	          }
	          else{
	              stk2.push(stk1.pop());
	          }
	      }
	       
	  }
	  else{
	      
	       
	      for(int i = 1; i < S.length(); i++){
	          char ch = S.charAt(i);
	          
	          if(!stk1.isEmpty() && (ch == 'p' && stk1.peek() == 'r')){
	              stk1.pop();
	              r++;
	          }
	          else{
	              stk1.push(ch);
	          }
	      }
	      
	      
	      stk2.push(stk1.pop());
	      
	      temp = stk2.peek();
	      
	      while(!stk1.isEmpty()){
	          
	          if(!stk2.isEmpty() && (stk1.peek() == 'p' && stk2.peek() == 'r')){
	              stk1.pop();
	              p++;
	              stk2.pop();
	          }
	          else{
	              stk2.push(stk1.pop());
	          }
	      } 
	  }
	  
	  return p*X + r*Y;
	}
} 

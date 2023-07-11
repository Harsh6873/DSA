//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	    int t=0;
	    int l=0;
	    int r=m-1;
	    int b=n-1;
	    ArrayList<Integer> als = new ArrayList<>();
	    while(t<=b && l<=r){
	        for(int i=l;i<=r;i++){
	            als.add(A[t][i]);
	        }
	        t++;
	        for(int j=t;j<=b;j++){
	            als.add(A[j][r]);
	        }
	        r--;
	        if(t <= b){
	            for(int i=r;i>=l;i--){
	                als.add(A[b][i]);
	            }
	        }
	        b--;
	        for(int i=b;i>=t;i--){
	            als.add(A[i][l]);
	        }
	        l++;
	    }
	    return als.get(k-1);
    }
}
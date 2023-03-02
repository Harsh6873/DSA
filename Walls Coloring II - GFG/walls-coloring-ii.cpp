//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
    int minCost(vector<vector<int>> &C) {
        int n = C.size(), k = C[0].size();
        
        if(k == 1) {
            return n == 1 ? C[0][0] : -1;
        }
        
        auto f = [&](int i) -> vector<int> {
            int mn1 = 1e9, mn2 = 1e9, idx = -1;
            for(int j = 0; j < k; j++) {
                if(C[i][j] < mn1) {
                    mn2 = mn1;
                    idx = j;
                    mn1 = C[i][j];
                }
                else if(C[i][j] < mn2) {
                    mn2 = C[i][j];
                }
            }
            return {mn1, mn2, idx};
        };
        
        for(int i = 1; i < n; i++) {
            vector <int> v = f(i - 1);
            int mn1 = v[0], mn2 = v[1], idx = v[2];
            for(int j = 0; j < k; j++) {
                C[i][j] += j == idx ? mn2 : mn1;
            }
        }
        
        return *min_element(C[n - 1].begin(), C[n - 1].end());
    }
};

//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    while (t--) {
        int n, k;
        cin >> n >> k;
        vector<vector<int>> costs(n, vector<int>(k));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) cin >> costs[i][j];
        }
        Solution obj;
        cout << obj.minCost(costs) << endl;
    }
}
// } Driver Code Ends
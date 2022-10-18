/*
LC-> 1020: Number Of Enclaves (Multi Source BFS)
GFG: https://practice.geeksforgeeks.org/problems/number-of-enclaves/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-enclaves
*/


#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    int numberOfEnclaves(vector<vector<int>> &grid) {
        int n = grid.size(), m = grid[0].size();
        // replace O's, with X's
        queue<pair<int,int>> q;
        for(int i=0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if((i == 0 || j == 0 || i == n-1 || j == m-1) && grid[i][j] == 1) {
                    grid[i][j] = 0;
                    q.push({i,j});
                }
                else {
                    continue;
                }
            }
        }
        int dx[] = {0, 1, 0, -1};
        int dy[] = {-1, 0, 1, 0};
        
        while(!q.empty()) {
            int x = q.front().first;
            int y = q.front().second;
            
            q.pop();
            
            for(int ind = 0; ind < 4; ind++) {
                int newx = x + dx[ind];
                int newy = y + dy[ind];
                
                if(newx >= 0 && newy >= 0 && newx < n && newy < m 
                   && grid[newx][newy] == 1) {
                    grid[newx][newy] = 0;
                    q.push({newx, newy});
                }
            }
        }
        
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m;j++) {
                if(grid[i][j] == 1) {
                    count++;
                }
            }
        }
        
        return count;
    }
};

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        vector<vector<int>> grid(n, vector<int>(m));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> grid[i][j];
            }
        }
        Solution obj;
        cout << obj.numberOfEnclaves(grid) << endl;
    }
}
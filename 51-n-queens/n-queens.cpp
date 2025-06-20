class Solution {
public:

    void addans(vector<vector<int>> &board, vector<vector<string>> &ans, int n){
        vector<string> temp;
        for(int i=0; i<n; i++){
            string st = "";
            for(int j=0; j<n; j++){
                if(board[i][j] == 0){
                    st.push_back('.');
                }else{
                    st.push_back('Q');
                }
            }
            temp.push_back(st);
        }

        ans.push_back(temp);
        return;
    }

    bool isSafe(int row, int col, vector<vector<int>> &board, vector<vector<string>> &ans, int n, unordered_map<int, bool> &rmap, unordered_map<int, bool> &d1map, unordered_map<int, bool> &d2map){
        if(rmap[row] == true) return false;
        if(d1map[(n-1)+(col-row)] == true) return false;
        if(d2map[row+col] == true) return false;
        return true;
    }


    void solve(int col, vector<vector<int>> &board, vector<vector<string>> &ans, int n, unordered_map<int, bool> &rmap, unordered_map<int, bool> &d1map, unordered_map<int, bool> &d2map){
        //base case
        if(col == n){
            addans(board, ans, n);
            return;
        }

        //else
        for(int row=0; row<n; row++){
            if(isSafe(row, col, board, ans, n, rmap, d1map, d2map)){
                board[row][col] = 1;
                rmap[row] = true;
                d1map[(n-1)+(col-row)] = true;
                d2map[row+col] = true;
                solve(col+1, board, ans, n, rmap, d1map, d2map);
                board[row][col] = 0;
                rmap[row] = false;
                d1map[(n-1)+(col-row)] = false;
                d2map[row+col] = false;
            }
        }

        return;
    }
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<int>> board(n, vector<int>(n, 0));
        vector<vector<string>> ans;

        unordered_map<int, bool> rmap;
        unordered_map<int, bool> d1map;
        unordered_map<int, bool> d2map;

        solve(0, board, ans, n, rmap, d1map, d2map);
        return ans;
    }
};
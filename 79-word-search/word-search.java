class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        int [][] visited = new int [row][col];
        boolean ans= false;
        int len = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j< col;j++){
                if(board[i][j] == word.charAt(0)){
                    ans = helper(i,j,len,board,visited,word,row,col);
                    if(ans)return true;
                }
            }
        }
        return false;
    }

    public boolean  helper(int i,int j,int len,char [][]board,int [][]visited,String word,int row, int col){
        len++;
        visited[i][j] =1;
        if(len == word.length())return true;
        boolean up = false;
        boolean down = false;
        boolean left = false;
        boolean right = false;

        //check right 
        if(i+1 <row && board[i+1][j] == word.charAt(len) && visited[i+1][j] == 0){
            right = helper(i+1,j,len,board,visited,word,row,col);
        }
        //check down
        if (j+1 < col && board[i][j+1] == word.charAt(len) && visited[i][j+1] == 0){
           down = helper(i,j+1,len,board,visited,word,row,col);
        }

        //check left 
        if (i-1 >=0 && board[i-1][j] == word.charAt(len) && visited[i-1][j] == 0){
            left = helper(i-1,j,len,board,visited,word,row,col);
        }
        //check up
        if (j-1 >= 0 && board[i][j-1] == word.charAt(len) && visited[i][j-1] == 0){
            up = helper(i,j-1,len,board,visited,word,row,col);
        }
        visited[i][j] = 0;
        return up || down || left || right;

    }
}
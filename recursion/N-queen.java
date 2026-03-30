class Solution {
    static List<List<String>>res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        res.clear();
        char [][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(0,board,n);
        return res;
    }
    public static void solve(int row,char[][]board,int n){
        if(n==row){
            print(board,n);
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                solve(row+1,board,n);
                board[row][col]='.';
            }
        }
    }
    public static boolean isSafe(char [][] board,int row,int col,int n){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q')return false;
        }
        for(int i=row-1 ,j=col-1 ; i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row-1,j=col+1; i>=0 && j<n ;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }
    public static void print(char [][]board,int n){
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
        list.add(new String(board[i]));
            }
            res.add(list);
        }
    }

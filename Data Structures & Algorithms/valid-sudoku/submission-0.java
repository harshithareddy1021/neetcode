class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            HashSet<Character> set1=new HashSet<>();
            for(int j=0;j<c;j++){
                if(board[i][j]=='.')continue;
                if(set1.contains(board[i][j]))return false;
                set1.add(board[i][j]);
            }
        }

        for(int i=0;i<r;i++){
            HashSet<Character> set2=new HashSet<>();
            for(int j=0;j<c;j++){
                if(board[j][i]=='.')continue;
                if(set2.contains(board[j][i]))return false;
                set2.add(board[j][i]);
            }
        }

        for(int f=0;f<r;f++){
            HashSet<Character> set3=new HashSet<>();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int rr=(f/3)*3+i;
                    int cc=(f%3)*3+j;
                    if(board[rr][cc]=='.')continue;
                    if(set3.contains(board[rr][cc]))return false;
                    set3.add(board[rr][cc]);

                }
            }
        }
        return true;
        
    }
}

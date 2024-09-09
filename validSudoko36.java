class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character>vertical=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(vertical.contains(board[i][j]))return false;
                    vertical.add(board[i][j]);
                }
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character>horizontal=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    if(horizontal.contains(board[j][i]))return false;
                    horizontal.add(board[j][i]);
                }
            }
        }
         for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Character> gridSet = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] != '.') {
                            if (gridSet.contains(board[i][j])) return false;
                            gridSet.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
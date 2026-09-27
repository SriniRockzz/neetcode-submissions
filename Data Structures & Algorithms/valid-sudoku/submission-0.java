class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int r = 0; r < 9; r++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') {
                    if (!rowSet.add(board[r][c])) return false;
                }
                if (board[c][r] != '.') {
                    if (!colSet.add(board[c][r])) return false;
                }
            }

        }

        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                HashSet<Character> boxSet = new HashSet<>();
                for (int r = boxRow; r < boxRow + 3; r++) {
                    for (int c = boxCol; c < boxCol + 3; c++) {
                        if (board[r][c] != '.') {
                            if (!boxSet.add(board[r][c])) return false;
                        }
                    }
                }
            }
        }


        return true;
    }
}


class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (rec(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean rec(char[][] board, String word, int i, int j, int idx) {
        // ✅ Base condition
        if (idx == word.length()) return true;

        // ✅ Boundary and mismatch checks
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(idx))
            return false;

        // ✅ Mark visited
        char temp = board[i][j];
        board[i][j] = '#';

        // ✅ Explore all directions
        boolean found = rec(board, word, i + 1, j, idx + 1) ||
                        rec(board, word, i - 1, j, idx + 1) ||
                        rec(board, word, i, j + 1, idx + 1) ||
                        rec(board, word, i, j - 1, idx + 1);

        // ✅ Backtrack
        board[i][j] = temp;

        return found;
    }
}

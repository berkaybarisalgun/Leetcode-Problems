package ValidSudoku_36;

import ValidSudoku_36.Solution;

public class Main {
    public static void main(String[] args) {
        char[][] board = {
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','6','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}
        };
        Solution solution=new Solution();

        System.out.println(solution.isValidSudoku(board));
    }
}

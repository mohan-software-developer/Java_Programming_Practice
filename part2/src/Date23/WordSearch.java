package Date23;
import java.util.*;
public class WordSearch {
    private StringBuilder sb;

    public boolean exist(char[][] board, String word) {
        sb = new StringBuilder();

        // Iterate through each cell in the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (check(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean check(char[][] board, String word, int index, int i, int j) {
        // If the entire word has been matched, return true
        if (index == word.length()) {
            return true;
        }

        // Check if current position is out of bounds or doesn't match the word
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Temporarily append the current character to the StringBuilder
        sb.append(board[i][j]);

        // Mark the current cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Recursively check neighboring cells
        if (check(board, word, index + 1, i + 1, j) ||
            check(board, word, index + 1, i - 1, j) ||
            check(board, word, index + 1, i, j + 1) ||
            check(board, word, index + 1, i, j - 1)) {
            return true;
        }

        // Backtrack: Restore the cell and remove the last character from StringBuilder
        board[i][j] = temp;
        sb.setLength(sb.length() - 1);

        return false;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        WordSearch wordSearch = new WordSearch();
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = sc.nextLine();
        System.out.println(wordSearch.exist(board, word)); // Output: true
    }
}


package lecture_20;

public class N_Queen {
	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		int tq = n;
		print(board, tq, 0);
	}

	public static void print(boolean[][] board, int tq, int row) {

		if (tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				print(board, tq - 1, row + 1);
				board[row][col] = false;
			}
		}
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// up
		for (int r = row; r >= 0; r--) {
			if (board[r][col] == true) {
				return false;
			}
		}
		// left digonal

		for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
			if (board[r][c] == true) {
				return false;
			}
		}

		// right diagonal
		for (int r = row, c = col; r >= 0 && c < board[0].length; r--, c++) {
			if (board[r][c] == true) {
				return false;
			}
		}
		return true;
	}

	public static void Display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}

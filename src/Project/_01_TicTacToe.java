package Project;

import java.util.Scanner;

public class _01_TicTacToe {

	private final int SIZE = 3;
	private char[][] board = new char[SIZE][SIZE]; // 게임 보드
	private char currentPlayer = 'X'; // 현재 플레이어

	public _01_TicTacToe() {
		// 게임 보드 초기화
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = '-';
			}
		}
	}

	public void playGame() {
		boolean isGameOver = false;
		while (!isGameOver) {
			printBoard();
			int row;
			int col;
			do {
				row = getRow();
				col = getCol();
			} while (!isValid(row, col));

			makeMove(row, col);
			isGameOver = checkForWin(row, col);

			switchPlayer();
		}
	}

	private void printBoard() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	private int getRow() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row number (0, 1, or 2) for player " + currentPlayer + ": ");
		return scanner.nextInt();
	}

	private int getCol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the column number (0, 1, or 2) for player " + currentPlayer + ": ");
		return scanner.nextInt();
	}

	private boolean isValid(int row, int col) {
		if (row < 0 || col < 0 || row >= SIZE || col >= SIZE) {
			return false;
		} else if (board[row][col] != '-') {
			return false;
		}
		return true;
	}

	private void makeMove(int row, int col) {
		board[row][col] = currentPlayer;
	}

	private boolean checkForWin(int rowMove, int colMove) {
		return (board[rowMove][0] == currentPlayer && board[rowMove][1] == currentPlayer
				&& board[rowMove][2] == currentPlayer)
				|| (board[0][colMove] == currentPlayer && board[1][colMove] == currentPlayer
						&& board[2][colMove] == currentPlayer)
				|| (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
				|| (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
	}

	private void switchPlayer() {
		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	}

	public static void main(String[] args) {
		_01_TicTacToe game = new _01_TicTacToe();
		game.playGame();
	}
}

package com.recursive.pratice;

/**
 * Knight tour and with backtracking
 * @author Manas
 *
 */
		
public class KnightTourProblem {

	public static void main(String[] args) {
		int row = 2;
		int col = 2;
		int[][] chess = new int[5][5];
		printKnightTour(chess, row, col, 1);
		
	}

	private static void printKnightTour(int[][] chess, int row, int col, int move) {
		if (row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0) {
			return;
		} else if (move == chess.length * chess.length) {
			chess[row][col] = move;
			displayChessBoard(chess);
			chess[row][col]=0;
			return;
		}
		chess[row][col] = move;
		printKnightTour(chess, row - 2, col + 1, move + 1);
		printKnightTour(chess, row - 1, col + 2, move + 1);
		printKnightTour(chess, row + 1, col + 2, move + 1);
		printKnightTour(chess, row + 2, col + 1, move + 1);
		printKnightTour(chess, row + 2, col - 1, move + 1);
		printKnightTour(chess, row + 1, col - 2, move + 1);
		printKnightTour(chess, row - 1, col - 2, move + 1);
		printKnightTour(chess, row - 2, col - 1, move + 1);
		chess[row][col] = 0;
	}

	private static void displayChessBoard(int[][] chess) {
		for(int i=0;i<chess.length;i++) {
			for(int j=0;j<chess[0].length;j++) {
				System.out.print(chess[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();

	}

}

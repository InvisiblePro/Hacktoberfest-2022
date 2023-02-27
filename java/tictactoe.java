import java.util.Scanner;


public class tictactoe {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("\nLet's play tic tac toe");

		char board[][] = {
				{'_','_','_'}
				,{'_','_','_'}
				,{'_','_','_'}
		};

		printBoard(board);


		for(int i=0; i<9; i++) {

			if( i % 2 == 0) {
				System.out.println("Turn: X");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'X';
				printBoard(board);
			} else {
				System.out.println("Turn: O");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'O';
				printBoard(board);
			}

			int count = checkWin(board);

			if(count == 3) {
				System.out.println("X wins");
				break;
			}
			else if (count == -3) {
				System.out.println("O wins");
				break;
			} else if (i == 8) {
				System.out.println("It's a tie!");
			}

		}

		scan.close();
	}


	public static void printBoard(char array[][]) {
		System.out.println();

		for(int i=0; i<array.length; i++) {
			System.out.print("\t" + array[i][0] + " " + array[i][1] + " " + array[i][2]);
			System.out.print("\n\n");
		}

	}


	public static int[] askUser(char board[][]) {
		System.out.print(" - pick a row and column number: ");

		int row = scan.nextInt() - 1;
		int column = scan.nextInt() - 1;

		while(board[row][column] != '_') {
			System.out.print("Spot taken, try again: ");

			row = scan.nextInt() - 1;
			column = scan.nextInt() - 1;
		}

		int array[] = {row, column};

		return array;
	}


	public static int checkWin(char board[][]) {
		int count = 0;

		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if (board[i][j] == 'X') {
					count++;
				} else if(board[i][j] == 'O') {
					count--;
				}
			}

			if (count == 3 || count == -3) {
				return count;
			} else {
				count = 0;
			}
		}


		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if (board[j][i] == 'X') {
					count++;
				} else if(board[j][i] == 'O') {
					count--;
				}
			}

			if (count == 3 || count == -3) {
				return count;
			} else {
				count = 0;
			}
		}


		for(int i=0; i<board.length; i++) {
			if (board[i][i] == 'X') {
				count++;
			} else if(board[i][i] == 'O') {
				count--;
			}
		}


		if (count == 3 || count == -3) {
			return count;
		} else {
			count = 0;
		}


		for(int i=0; i<board.length; i++) {
			if (board[i][2-i] == 'X') {
				count++;
			} else if(board[i][2-i] == 'O') {
				count--;
			}
		}
		return count;
	}
}

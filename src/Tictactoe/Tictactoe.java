package Tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Tictactoe {
static char[] board = new char[10];  
public static void main(String args[]) {
	System.out.println("Welcome to Tictactoe Game---");
	Board();
	Inputchoice();
	
}


private static void Inputchoice() {
	Scanner inp = new Scanner(System.in);
	System.out.println("Choose 'X' OR 'O' as input: ");
	String choice = inp.nextLine();
	Random rand = new Random();
	int randnum = rand.nextInt(2);
	System.out.println("Determining between Player or computer");
	if(randnum==1) {
		System.out.println("Player inputs:");
	}
	else {
		System.out.println("Computer inputs:");
	}
	
	
	
	
}


private static char[] Board() {
	for (int i=1; i<board.length; i++) {
		
		board[i]=' ';
	}
	return board;
	}	
}


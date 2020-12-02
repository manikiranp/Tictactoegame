package Tictactoe;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Tictactoe {
static String[] board = new String[10];
private static String compchoice;
private static String playchoice;
private static Scanner userInput;
static Set<Integer> indexset=new LinkedHashSet<Integer>();
public static void main(String args[]) {
	System.out.println("---Welcome to Tictactoe Game---");
	Tictactoe game = new Tictactoe();
	Tictactoe.Board();
	Tictactoe.Inputchoice();
	Tictactoe.ShowBoard(board);
	
	while(indexset.size()<=9) {
	Tictactoe.checkWinner();
	Tictactoe.SelectLocation(board);
	Tictactoe.Selectloc_comp(board);
	}
}



private static String[] SelectLocation(String[] board2) {
	System.out.println("Select the index to place: "+ playchoice); 
	int cond=1;
	while(cond==1) {
		//System.out.println("Select the index to place: "+ playchoice);
		Scanner userinput = new Scanner(System.in);
		int index = userinput.nextInt();
		if  (((index > 0 ) && (index < 10)) && (!indexset.contains(index)) ) {
		indexset.add(index);
		board2[index] = playchoice;
		ShowBoard(board2);
		cond=0;
	}
	else {
			System.out.println("Incorrect index number");
			System.out.println("Enter again");
	}
	}
	return board2;
}

private static String[] Selectloc_comp(String[] board2) {
	Random random=new Random();
	boolean match=true;
	while(match==true) {
	int index=random.nextInt(9)+1;
	
	if(indexset.contains(index))  
		match=true;
		else {
		System.out.println(index+" is comp chpoice");
		indexset.add(index);
		board2[index] = compchoice;
		 ShowBoard(board2);
		 match=false;
		}
		}
	
	return board2;
	}
	
	





private static void ShowBoard(String[] board2) {
	System.out.println("TicTacToe Board:");
	System.out.println("_____________");
	System.out.println("|  "+board2[1]+"|  "+board2[2]+"|  "+board2[3]+"|");
	System.out.println("─────────────");
	System.out.println("|  "+board2[4]+"|  "+board2[5]+"|  "+board2[6]+"|");
	System.out.println("─────────────");
	System.out.println("|  "+board2[7]+"|  "+board2[8]+"|  "+board2[9]+"|");
	System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾");
	
}


private static void Inputchoice() {
	userInput = new Scanner(System.in);
	System.out.println("Choose 'X' OR 'O' as input: ");
	
	//playchoice = userInput.next().toUpperCase();
	playchoice=userInput.next().toUpperCase();
	
	if(playchoice.equals("X")) {
			compchoice = "O";
	}
	else if(playchoice.equals("O")) {
			compchoice = "X";
	}
	else {
		System.out.println("Wrong input");
		Inputchoice();
	}

	
}


private static String[] Board() {
	for (int i=1; i<board.length; i++) {

		board[i]=" ";
	}
	return board;
	}

static void checkWinner() 
{ 
    for (int a = 0; a < 8; a++) { 
        String line = null; 

        switch (a) { 
        case 0: 
            line = board[1] + board[1] + board[3]; 
            break; 
        case 1: 
            line = board[4] + board[4] + board[6]; 
            break; 
        case 2: 
            line = board[7] + board[8] + board[9]; 
            break; 
        case 3: 
            line = board[1] + board[4] + board[7]; 
            break; 
        case 4: 
            line = board[2] + board[5] + board[8]; 
            break; 
        case 5: 
            line = board[3] + board[6] + board[9]; 
            break; 
        case 6: 
            line = board[1] + board[5] + board[9]; 
            break; 
        case 7: 
            line = board[3] + board[5] + board[7]; 
            break; 
        } 
        //For X winner
        
        if (line.equals("XXX")) {
        	if(playchoice.equals("X")) { 
        	System.out.println("Player won the game"); }
        	else	System.out.println("Player won the game"); 
        	System.exit(0);
            //return "X";
        } 
          
        // For O winner 
        else if (line.equals("OOO")) {
        	if(playchoice.equals("O")) 
            	System.out.println("Player won the game"); 
            	else	System.out.println("Computer won the game");
        	System.exit(0);
            //return "O"; 
        }
   
        }
}
	
}


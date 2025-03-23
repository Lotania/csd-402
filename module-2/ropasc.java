//Anthony Nguyen, Assignment M2
//The purpose of this program is to demonstrate various java concepts
//through a rock paper scissors game.

import java.util.*;// * to accept scanner and random

public class ropasc {
	public static void main(String[] args) {
		//battle cry
		System.out.println("PREPARE FOR ROCK PAPER SCISSORS BATTLE");
			
			//set input variables and input-based variables
			Scanner scanner = new Scanner(System.in);
			String inputSelect;
			boolean validInput = false;//trigger for input lood
			int selectSelect = 0;
			String playerSelect;
			String playagain;
			
			//use for validating player input
			while(!validInput){
				System.out.println("MAKE YOUR SELECTION");
				System.out.println("1-Rock, 2-Paper, 3-Scissors");
				//setting inputSelect to int risked a program-crashing error
				//setting to a string will allow us to try to parse without crashing
				inputSelect = scanner.nextLine();
				try {
					selectSelect = Integer.parseInt(inputSelect);
					//only 1, 2, and 3 are acceptable
					if((selectSelect != 1) && (selectSelect !=2) && (selectSelect !=3)){
						System.out.println("INVALID INPUT");
					}else{
						validInput = true;
					}
				} catch (Exception e) {
					System.out.println("INVALID INPUT");
				}
			}//traps the user until they provide a 1, 2, or 3
		
			//assign the player's choice
			if (selectSelect == 1){
				playerSelect = "Rock";
			}else if (selectSelect == 2){
				playerSelect = "Paper";
			}else{
				playerSelect = "Scissors";
			}
			
			//generate random between 1 and 3
			int randomSelect = (int) (Math.random() * 3) +1;
			String compSelect;
			//assign the random's choice
			if (randomSelect == 1){
				compSelect = "Rock";
			}else if (randomSelect == 2){
				compSelect = "Paper";
			}else{
				compSelect = "Scissors";
			}
			//display the choices
			System.out.println("You chose " + playerSelect);
			System.out.println("The CPU chose " + compSelect);
			
			//display the result based on the choices
			if (selectSelect == randomSelect){
				System.out.println("DRAW. NO WINNER.");
			}
			
			if ((selectSelect == 1 && randomSelect == 2) || (selectSelect == 2 && randomSelect == 3) || (selectSelect == 3 && randomSelect == 1)){
				System.out.println("THE CPU WINS");
			}
			
			if ((randomSelect == 1 && selectSelect == 2) || (randomSelect == 2 && selectSelect == 3) || (randomSelect == 3 && selectSelect == 1)){
				System.out.println("YOU WIN!");
			}
		//end message
		System.out.println("THANKS FOR PLAYING!");
	}
}
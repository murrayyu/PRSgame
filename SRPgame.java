/* Geoff Duong
 * Zijing Yu
 * Xiaoxiao Yu
 * COSC 481W
 * Evett
 * 
 * Welcome to our Rock, paper, scissor, lizard, spock game. You will have tons of fun playing this game against our world-class computer.
 * You have 5 choices as stated in the name of the game. Please type in "quit" to terminate the game.
 */
import java.util.Random;
import java.util.Scanner;
//SRPgame class
public class SRPgame {
	//Main method
	public static void main(String[] args) {
		//Run forever, unless user enters in "quit"
		while(true){
			//Prompt user
			System.out.println("Hey, let's play Rock, Paper, Scissors! ");
			System.out.println("Enter quit to stop the game. ");
			//Declare variables and initialize
			Scanner scan = new Scanner(System.in);
			Random num = new Random();
			String Computerplay =" ";
			String player =" ";

			//Generate a random number from 1 - 4, and assign corresponding choice
			int Computer = num.nextInt(5)+1;
			if(Computer == 1){
				Computerplay = "scissors";
			}else if (Computer ==2){
				Computerplay = "rock";
			}else if (Computer == 3){
				Computerplay = "paper";
			}else if (Computer == 4){
				Computerplay = "lizard";
			}else
				Computerplay = "spock";

			//-----------------PLAY CODE START------------------------

			//Prompt user
			System.out.println("Enter your choice");

			//Read in choice and make it all lowercase
			player = scan.next();
			player = player.toLowerCase();

			//Make sure that input is valid
			if ((player.equals("scissors")) || (player.equals("paper")) || (player.equals("rock")) || (player.equals("lizard")) || (player.equals("spock"))){

				//If player choice and computer choice is the same, it is a tie
				if(player.equals(Computerplay)){
					System.out.println("Tie");
				}
				//condition 1 : player = scissors
				else if(player.equals("scissors")) {
					if(Computerplay=="rock" || Computerplay == "spock"){
						System.out.println("You Lose");
					}else if(Computerplay=="paper" || Computerplay == "lizard"){
						System.out.println("You Win");
					}
				}
				//condition 2 : player = rock
				else if(player.equals("rock")){
					if(Computerplay=="scissors" || Computerplay == "lizard"){
						System.out.println("You Win");
					}else if(Computerplay=="paper" || Computerplay == "spock"){
						System.out.println("You Lose");
					}

				}
				//condition 3 : player = paper
				else if(player.equals("paper")){
					if(Computerplay=="scissors" || Computerplay == "lizard"){
						System.out.println("You Lose");
					}else if(Computerplay=="rock" || Computerplay == "spock"){
						System.out.println("You Win");
					}
				}
				//condition 5 : player = lizard
				else if(player.equals("lizard")){
					if(Computerplay=="rock" || Computerplay == "scissors"){
						System.out.println("You Lose");
					}else if(Computerplay=="spock" || Computerplay == "paper"){
						System.out.println("You Win");
					}
				}
				//condition 6 : player = spock
				else if(player.equals("spock")){
					if(Computerplay=="paper" || Computerplay == "lizard"){
						System.out.println("You Lose");
					}else if(Computerplay=="rock" || Computerplay == "scissors"){
						System.out.println("You Win");
					}
				}

				//Display computer choice
				System.out.println("Computer choice is "+Computerplay);
				System.out.println();
				
			//If player enters in "quit" break out of loop	
			}else if (player.equals("quit")){
				break;
			}
			//If input is invalid, tell user it is invalid
			else {
				System.out.println("You should have vaild input(rock, paper, scissors, lizard, or spock)");
				System.out.println();
			}
		}
	}
}

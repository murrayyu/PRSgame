import java.util.Random;
import java.util.Scanner;


public class SRPgame {

	public static void main(String[] args) {
		System.out.println("Hey, let's play Rock, Paper, Scissors!");
		Scanner scan = new Scanner(System.in);
		Random num = new Random();
		String Computerplay =" ";
		String player =" ";
		
		int Computer = num.nextInt(3)+1;
		if(Computer == 1){
			Computerplay = "scissors";
		}else if (Computer ==2){
			Computerplay = "rock";
		}else {
			Computerplay = "paper";
		}
		
		// play code start 
		
		System.out.println("Enter your choice");
		
		player = scan.nextLine();
		player = player.toLowerCase();
		
		
		if(player.equals(Computerplay)){
			System.out.println("Tie");
		}
		//condition 1 : player = scissors
		else if(player.equals("scissors")) {
			if(Computerplay=="rock"){
				System.out.println("You Lose");
			}else if(Computerplay=="paper"){
				System.out.println("You Win");
			}
			
			
		}
		//condition 2 : player = rock
		else if(player.equals("rock")){
			if(Computerplay=="scissors"){
				System.out.println("You Win");
			}else if(Computerplay=="paper"){
				System.out.println("You Lose");
			}
			
		}
		//condition 3 : player = paper
		else if(player.equals("paper")){
			if(Computerplay=="scissors"){
				System.out.println("You Lose");
			}else if(Computerplay=="rock"){
				System.out.println("You Win");
			}
		}
		
		System.out.println("Computer choice is "+Computerplay);
		
		
	}

}
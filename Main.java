import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		// Generate a random integer between 1 and 10000
		Random kt_randomNum = new Random();
		
		// Initialize Variables
		int kt_targetNum = kt_randomNum.nextInt(1000) + 1;
		int kt_minRange = 1;
		int kt_maxRange = 1000;
		int kt_usersGuess;
		boolean kt_isUserWinner = false;
		
		System.out.println("Welcome to Kane's Guessing Game! \n");
		System.out.println("I'm your host Kane Toomer! \n");
		System.out.println("The object of the game is to try to guess the number I am thinking of between 1 and 10000. \n");
		
	    do {
		    Scanner scnr = new Scanner(System.in);
		    
		    System.out.println("Enter your guess: ");
		    kt_usersGuess = scnr.nextInt();
		    
		    if(kt_usersGuess < kt_targetNum){
		        System.out.println("HIGHER!!!");
		        
		        kt_minRange = kt_usersGuess + 1;
		        
		    } else if(kt_usersGuess > kt_targetNum) {
		        System.out.println("LOWER!!!");
		        
		        kt_maxRange = kt_usersGuess - 1;
		        
		    } else {
		        kt_isUserWinner = true;
		        System.out.println("WINNER WINNER CHICKEN DINNER!!! \n");
		    }
		    
		} while(!kt_isUserWinner);
		
		System.out.println("Annoucer, tell the user what they've won!!! \n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Absolutely nothing (:");
		
	}
}
/*
 * Class: CMSC203 
 * Instructor: Dr. Ahmed Tarek
 * Description: Random Number Generator
 * Due: 2/23/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Shirvani
*/






import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) 
	{	
		int lowGuess = 0;
		int highGuess = 99;
		int nextGuess = 1;
		int userGuess = -99;
		String continueGame = "";
		boolean outOfRange = true;
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		// Create random number
		RNG ran = new RNG();
		int randomNumber = RNG.rand();
		
		// Debug
		//System.out.println("Random Number: " + randomNumber);
		while(userGuess != randomNumber)
		{	 
	
		    if (nextGuess == 1)
			{
				System.out.println("Enter your first guess:");
				 boolean hasNextInt = myObj.hasNextInt();
				 
					while(!hasNextInt) 
					{
						
						if (myObj.hasNextInt()) 
						{
							hasNextInt = true;
						} 
						else 
						{ 
							System.out.println("Please enter an integer");
							myObj.nextLine();
						}
					}
				userGuess = myObj.nextInt();  // Read user input
				System.out.println("Number of guesses is: " + nextGuess);  // Output user input
			}
			
			if(userGuess < randomNumber)
			{
				System.out.println("Your guess is too low!");
				if (userGuess > lowGuess)
				{
					lowGuess = userGuess;
				}
			}
			else if(userGuess > randomNumber)
			{
				System.out.println("Your guess is too high!");
				
					if (userGuess < highGuess)
					{
						highGuess = userGuess;
					}
			}	
			
			// Keep asking for input while it is out of range
			while (outOfRange == true && userGuess != randomNumber)
			{
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				userGuess = myObj.nextInt();
				
				if (userGuess < lowGuess || userGuess > highGuess)
				{
					System.out.println("	>>> Guess must be between " + lowGuess + " and " + highGuess + ". Try again");
				}
				else 
				{
					outOfRange = false;
					nextGuess++;
					System.out.println("Number of guesses is: " + nextGuess);
				}
			}
			
					if (userGuess == randomNumber)
					{
							System.out.println("Congratulations, you guessed correctly");
							System.out.println("Try again? (yes or no)");
							
							// Consume newline and get user input
							continueGame = myObj.nextLine();
							continueGame = myObj.nextLine();
							
						 while(!(continueGame.toLowerCase().contentEquals("yes") || continueGame.toLowerCase().contentEquals("y")) && !(continueGame.toLowerCase().contentEquals("no") || continueGame.toLowerCase().contentEquals("n")))
						 {           	
							        System.out.println("Please enter yes or no");
							        continueGame = myObj.nextLine().trim();
						 }
								if (continueGame.contentEquals("yes"))
								{
									randomNumber = RNG.rand();
									// Debug
									//System.out.println("New random: " + randomNumber);
									
									lowGuess = 0;
									highGuess = 99;
									nextGuess = 1;
								}
								else 
								{
									System.out.println("Thanks for playing...");
								}
						}
			outOfRange = true;
		}
	}	
} 


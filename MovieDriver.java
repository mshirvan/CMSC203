import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Movie m = new Movie();
		String cont = "yes";
		ArrayList<String> rating = new ArrayList<String>(Arrays.asList("G","PG","PG13","R"));
		
		while (cont.toLowerCase().contentEquals("yes")) 
		{
			
			
			System.out.println("Please enter the title of a movie");
			 String userInput = keyboard.nextLine().trim();
			 m.setTitle(userInput);
			 System.out.println("Please enter the movie's rating");
			 userInput = keyboard.nextLine().trim();
			 
			 while (!rating.contains(userInput.toUpperCase())) 
			 {
				 System.out.println("Please Enter G, PG, PG13, or R");
				 userInput = keyboard.nextLine().trim();
			 } 
			
			 m.setRating(userInput);
			 System.out.println("Please enter the number of tickets sold");
			 boolean hasNextInt = keyboard.hasNextInt();
			 
			while(!hasNextInt) 
			{
				
				if (keyboard.hasNextInt()) 
				{
					hasNextInt = true;
				} 
				else 
				{ 
					System.out.println("Please enter a number of above 0");
					keyboard.nextLine();
				}
			}
			 
			int ticketsSold = keyboard.nextInt();
			 
			 m.setSoldTickets(ticketsSold);
			 System.out.println(m.toString()); 
			 keyboard.nextLine();
			 System.out.println("Would you like to enter another movie");
			 cont = keyboard.nextLine().trim();
			 
			 while(!cont.toLowerCase().contentEquals("yes") && !cont.toLowerCase().contentEquals("no")) 
			 {
				 
				 	System.out.println("Please type yes or no");
				 	cont = keyboard.nextLine().trim();
			 }
					 
		}
		
		System.out.println("Thank you, Goodbye");

	}
	}
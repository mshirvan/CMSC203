/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Troubleshoot Wifi connection issues
 * Due: 2/07/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Shirvani
*/
import java.util.Scanner;

public class WifiDiagnostic {
    public static void main (String [] args) {
    	
    	//Create Scanner Object
    	Scanner keyboard = new Scanner(System.in);  
    	
    	//First step 
        System.out.println("Step 1");
    	System.out.println("Reboot the computer and try to connect");

        System.out.println("Did that fix the problem");
        String userInput =  keyboard.nextLine().trim(); 
        
        
        while(!(userInput.toLowerCase().contentEquals("yes") || userInput.toLowerCase().contentEquals("y")) && !(userInput.toLowerCase().contentEquals("no") || userInput.toLowerCase().contentEquals("n"))) 
        {
        	System.out.println("Please enter yes or no");
        	userInput = keyboard.nextLine().trim();
        }	
        
	        if (userInput.toLowerCase().contentEquals("yes") || userInput.toLowerCase().contentEquals("y")) 
	    	{	
	    		System.out.print("That seemed to solve the problem!");
	    	}    
	        else 
        	{
        		System.out.println("Step 2"); // Second Step 
        		System.out.println("Reboot the router and try to connect again");
        		System.out.println("Did that fix the problem?");
        		userInput = keyboard.nextLine().trim();
        		
	       while(!(userInput.toLowerCase().contentEquals("yes") || userInput.toLowerCase().contentEquals("y")) && !(userInput.toLowerCase().contentEquals("no") || userInput.toLowerCase().contentEquals("n"))) 
	 		 {
	 		    System.out.println("Please enter yes or no"); 
	 		    userInput = keyboard.nextLine().trim();
	 		 }           			
	    if (userInput.toLowerCase().contentEquals("yes") || userInput.toLowerCase().contentEquals("y")) 
	    {
	    	System.out.println("That seemed to solve the problem!");
	    } 
		        else 
		        {
	            	System.out.println("Step 3");  // Third Step 
	                System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
	                System.out.println("Did that fix the problem?");
	                userInput = keyboard.nextLine().trim();
	                
				        while(!(userInput.toLowerCase().contentEquals("yes") || userInput.toLowerCase().contentEquals("y")) && !(userInput.toLowerCase().contentEquals("no") || userInput.toLowerCase().contentEquals("n")))
				        {
				        	System.out.println("Please enter yes or no");
				        	userInput = keyboard.nextLine().trim();
				        }
				        
                if (userInput.toLowerCase().contentEquals("yes") || userInput.toLowerCase().contentEquals("y")) 
                {   
                	System.out.println("That seemed to solve the problem");
                } 
                else 
                {
                	System.out.println("Step 4"); // Fourth Step 
                    System.out.println("Move the computer closer to the router and try to connect");
                    System.out.println("Did that fix the problem?");
                    userInput = keyboard.nextLine().trim();
        while(!(userInput.toLowerCase().contentEquals("yes") || userInput.toLowerCase().contentEquals("y")) && !(userInput.toLowerCase().contentEquals("no") || userInput.toLowerCase().contentEquals("n")))
        {           	
        		System.out.println("Please enter yes or no");
                userInput = keyboard.nextLine().trim();
        }
                    if (userInput.toLowerCase().contentEquals("yes") || userInput.toLowerCase().contentEquals("y")) 
                    {	
                        System.out.println("That seemed to solve the problem!");
                    } 
                    else 
                    { 
                    	System.out.println("Last Step"); // Last step 
                        System.out.println("Contact your ISP");
                    }
                }
            }
        } 
        keyboard.close();
        
    }
}
//Task 3

import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
        Scanner guess = new Scanner(System.in);
        String input;

        if(guess.hasNextDouble()){
            input = guess.nextLine();
            System.out.println("Your guess is " + input);

         double valueGuess = Double.parseDouble(input);

        if(valueGuess < rnd_number){
            System.out.println("Your number is lower than the value");
            makeAGuess();
        }
        else if(valueGuess > rnd_number){
            System.out.println("Your number is higher than the value");
            makeAGuess();
        }
        else{
            System.out.println("Your guess is right");
        }

            
        } 
        else{
            input = guess.nextLine();
            System.out.println("your guess is not a number please try again");
            makeAGuess();
        }

       




		// Create a Scanner object   	 
    	// Read user input
    	
        //use hasNextDouble to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively
        }

    }
   


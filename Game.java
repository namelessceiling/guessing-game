import java.util.Scanner;
import java.util.ArrayList;

public class Game {

    private Scanner scanner;
    private int numGames;
    private ArrayList<Guess> listOfGames;
    private boolean isCorrect;
    private boolean loop;
    
    public Game(Scanner scanner) {
    	this.scanner = scanner;
    	this.numGames = 1;
    	this.listOfGames = new ArrayList<>();
    	this.isCorrect = false;
    	loop = true;
    }
    
    public void levelNumber(int level) {
    	int toBeGuessed = (int) (Math.random() * Math.pow(10, level)) + 1;
    	Guess guesses = new Guess();
    	System.out.println("Choose a number between 1 and " + (int) Math.pow(10, level));
    	while(!isCorrect) {
    	    int guess = scanner.nextInt();
    	    if(guess == toBeGuessed) {
    	    	guesses.addGuess(guess);
    	    	System.out.println("Good job, you guessed the number in " + guesses.getNumTries() + " number of tries!");
    	    	listOfGames.add(guesses);
    	    	isCorrect = true;
    	    } else if(guess < toBeGuessed) {
    	    	System.out.println("The number you guessed is too low. Guess again.");
    	    	guesses.addGuess(guess);
    	    } else {
    	    	System.out.println("The number you guessed is too high. Guess again.");
    	    	guesses.addGuess(guess);
    	    }
    	}
    	isCorrect = false;
    }
    
    public void start() {
        System.out.println("Guessing Game");
        System.out.println("Choose a difficulty: ");
        System.out.println("1. Beginner Level ");
        System.out.println("2. Intermediate Level ");
        System.out.println("3. Advanced Level ");
        System.out.println("4. Expert Level ");
        System.out.print("Enter a number: ");
        int level = scanner.nextInt();
        while(level != 1 && level != 2 && level != 3 && level != 4) {
            System.out.print("Error! Choose another number!  ");
            level = scanner.nextInt();
        }
        while(true) {
            this.levelNumber(level);
            System.out.print("Would you like to play again? ");
            String ans = scanner.next();
            System.out.println(ans);
            if(ans.equalsIgnoreCase("yes")) {
            	System.out.println("Would you like to change the difficulty?");
            	String answer = scanner.next();
            	if(answer.equalsIgnoreCase("yes")) {
            	    System.out.println("Choose the difficulty you would like to switch to ")
            	    level = scanner.nextInt();
            	    while(level != 1 && level != 2 && level != 3 && level != 4) {
            	    	System.out.print("Error! Choose another number! ");
            	    	level = scanner.nextInt();
            	    }
            	}
            	continue;
            } else {
            	this.printResults();
            	break;
            }
        }
    }
    

    public void printResults() {
    	System.out.println("Guess attempts history:");
    	for(int i = 0; i < listOfGames.size(); i++) {
    	    System.out.println("Game " + (i + 1) + ":");
    	    listOfGames.get(i).printResults();
    	    System.out.println("Won in " + listOfGames.get(i).getNumTries() + " tries\n");
    	}
    }
}

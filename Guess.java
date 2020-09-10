import java.util.ArrayList;

public class Guess {

    private ArrayList<Integer> guessCountHistory;
    
    public Guess() {
    	guessCountHistory = new ArrayList<>();
    }
    
    public void addGuess(int num) {
    	guessCountHistory.add(num);
    }
    
    public int getNumTries() {
    	return guessCountHistory.size();
    }
    
    public void printResults() {
    	System.out.println("Guesses: ");
    	for(int i = 0; i < guessCountHistory.size() - 1; i++) {
    	    System.out.print(guessCountHistory.get(i) + ", ");
    	}
    	System.out.println(guessCountHistory.get(guessCountHistory.size() - 1));
    }
}

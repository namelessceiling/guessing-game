import java.util.Scanner;

public class GuessingGame {
    public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	Game game = new Game(scanner);
    	game.start();
    }
}

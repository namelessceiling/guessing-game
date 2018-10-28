import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessingGame
{
    public static void main (String[] args)
    {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Guessing Game");
        System.out.println("Choose a difficulty: ");
        System.out.println("1. Beginner Level ");
        System.out.println("2. Intermediate Level ");
        System.out.println("3. Advanced Level ");
        System.out.println("4. Expert Level ");
        System.out.print("Enter a number: ");
        int level = myScan.nextInt();
        //Makes sure that the player has to pick the proper number and prevent infinite loops
        while(level != 1 &&  level != 2 && level != 3 && level != 4)
        {
            System.out.print("Error! Choose another number!  ");
            level = myScan.nextInt();
            myScan.nextLine();
        }
        List<Integer> guessCountHistory = new ArrayList<>();
        int counter1 = 0; //keeps track of the number of tries for the first level
        int randomlyGeneratedNum1 = (int) (Math.random()* Math.pow(10, 1)) + 1;
        boolean isCorrect = false;
        while(level == 1 && !isCorrect) //loops until the player gets the correct number
        {
            System.out.println("Choose a number between 1 and 10 ");
            int guess = myScan.nextInt();
            myScan.nextLine();
            counter1++;
            if(guess == randomlyGeneratedNum1)
            {
                System.out.println("Good job!You guessed the number in " + counter1 + " number of tries!");
                isCorrect = true;
                guessCountHistory.add(counter1);
            }
            else if(guess < randomlyGeneratedNum1)
            {
                System.out.println("The number you guessed is too low. Guess again.");
            }
            else
            {
                System.out.println("The number you guessed is too high. Guess again.");
            }
            if(isCorrect)
            {
                System.out.print("Would you like to play again? ");
                System.out.print("Enter yes or no: \n");
                String phrase = myScan.nextLine();
                if(phrase.equalsIgnoreCase("yes"))
                {
                    counter1 = 0;
                    randomlyGeneratedNum1 = (int)(Math.random()*Math.pow(10, 1)) + 1;
                    isCorrect = false;
                }
                else
                {
                    System.out.println("Guess attempts history: ");
                    for(int i = 0; i < guessCountHistory.size(); i++)
                    {
                        System.out.println("Game " + (i + 1) + ": " + guessCountHistory.get(i) + " tries");
                    }
                }
            }
        }
        int counter2 = 0;
        int randomlyGeneratedNum2 = (int) (Math.random() * Math.pow(10, 2)) + 1;
        while(level == 2 && !isCorrect)
        {
            System.out.println("Choose a number between 1 and 100 ");
            int guess = myScan.nextInt();
            myScan.nextLine();
            counter2++;
            if(guess == randomlyGeneratedNum2)
            {
                System.out.println("Good job! You guessed the number in " + counter2 + " number of tries!");
                isCorrect = true;
                guessCountHistory.add(counter2);
            }
            else if(guess < randomlyGeneratedNum2)
            {
                System.out.println("The number you guessed is too low. Guess again.");
            }
            else
            {
                System.out.println("The number you guessed is too high. Guess again.");
            }
            if(isCorrect)
            {
                System.out.print("Would you like to play again? Enter yes or no: ");
                String phrase = myScan.nextLine();
                if(phrase.equalsIgnoreCase("yes"))
                {
                    counter2 = 0;
                    randomlyGeneratedNum2 = (int) (Math.random()*Math.pow(10, 2)) + 1;
                    isCorrect = false;
                }
                else
                {
                    System.out.println("Guess attempts history: ");
                    for(int i = 0; i < guessCountHistory.size(); i++)
                    {
                        System.out.println("Game " + (i + 1) + ": " + guessCountHistory.get(i) + " tries");
                    }
                }
            }
        }
        int counter3 = 0;
        int randomlyGeneratedNum3 = (int) (Math.random() * Math.pow(10, 3)) + 1;
        while(level == 3 && !isCorrect)
        {
            System.out.println("Choose a number between 1 and 1000 ");
            int guess = myScan.nextInt();
            myScan.nextLine();
            counter3++;
            if(guess == randomlyGeneratedNum3)
            {
                System.out.println("Good job! You guessed the number in " + counter3 + " number of tries!");
                isCorrect = true;
                guessCountHistory.add(counter3);
            }
            else if(guess < randomlyGeneratedNum3)
            {
                System.out.println("The number you guessed is too low. Guess again.");
            }
            else
            {
                System.out.println("The number you guessed is too high. Guess again.");
            }
            if(isCorrect)
            {
                System.out.print("Would you like to play again? Enter yes or no: ");
                String phrase = myScan.nextLine();
                if(phrase.equalsIgnoreCase("yes"))
                {
                    counter3 = 0;
                    randomlyGeneratedNum3 = (int) (Math.random() * Math.pow(10, 3)) + 1;
                    isCorrect = false;
                }
                else
                {
                    System.out.println("Guess attempts history: ");
                    for(int i = 0; i < guessCountHistory.size(); i++)
                    {
                        System.out.println("Game " + (i + 1) + ": " + guessCountHistory.get(i) + " tries");
                    }
                }
            }
        }
        int counter4 = 0;
        int randomlyGeneratedNum4 = (int) (Math.random() * Math.pow(10, 4)) + 1;
        while(level == 4 && !isCorrect)
        {
            System.out.println("Choose a number between 1 and 10000 ");
            int guess = myScan.nextInt();
            myScan.nextLine();
            counter4++;
            if(guess == randomlyGeneratedNum4)
            {
                System.out.println("Good job! You guessed the number in " + counter4 + " number of tries!");
                isCorrect = true;
                guessCountHistory.add(counter4);
            }
            else if(guess < randomlyGeneratedNum4)
            {
                System.out.println("The number you guessed is too low. Guess again.");
            }
            else
            {
                System.out.println("The number you guessed is too high. Guess again.");
            }
            if(isCorrect)
            {
                System.out.print("Would you like to play again? Enter yes or no: ");
                String phrase = myScan.nextLine();
                if(phrase.equalsIgnoreCase("yes"))
                {
                    counter4 = 0;
                    randomlyGeneratedNum4 = (int) (Math.random() * Math.pow(10, 4)) + 1;
                    isCorrect = false;
                }
                else
                {
                    System.out.println("Guess attempts history: ");
                    for(int i = 0; i < guessCountHistory.size(); i++)
                    {
                        System.out.println("Game " + (i + 1) + ": " + guessCountHistory.get(i) + " tries");
                    }
                }
            }
        }
        myScan.close();
    }
}
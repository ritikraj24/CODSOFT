import java.util.Scanner;
import java.util.Random;
public class GuessingNumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Guessing the Number Game");
        int score = 0;
        boolean PlayAgain = true;
        while(PlayAgain){
            int randomNum = random.nextInt(100)+ 1;
            int attempts = 0;
            boolean guessedcorrect = false;
            System.out.println("I am guesssing a number between 1 to 100.");
            System.out.println("Can you guess which number am I guessing?, You have 5 Chance to guess.");
            while(attempts < 5 && !guessedcorrect){
                System.out.print("Enter your guess: ");
                int UserGuess = sc.nextInt();
                attempts++;

                if (UserGuess == randomNum){
                    System.out.println("Hurray! You guess the correct number.");
                    guessedcorrect = true;
                    score++;
                } else if (UserGuess < randomNum){
                    System.out.println("Too low! Try again.");
                } else{
                    System.out.println("Too high! Try again.");
                }
            }
            if (!guessedcorrect){
                System.out.println("Sorry! , You loose your chance. The Number was: " + randomNum);
            }
            System.out.println("Would you like to play another round? (Yes / No).");
            String response = sc.next();
            PlayAgain = response.equalsIgnoreCase("Yes");
        }
        System.out.println("Thank you for playing. Your Score is: " + score);
    }
    
}

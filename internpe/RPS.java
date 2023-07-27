import java.util.Random;
import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        System.out.println("Welcome to Rock-Paper-Scissors game!");
        int c=0,u=0;
        while (true) {
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            System.out.println("To exit game type stop or exit");
            String userChoice = scanner.nextLine().toLowerCase();
            if (userChoice.equals("exit")||userChoice.equals("stop")) {
                break;
            }
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];
            System.out.println("Computer's choice: " + computerChoice);
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (userChoice.equals("paper") && computerChoice.equals("rock"))
                    || (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("Congratulations! You win!");
                c=c+1;
                System.out.println("your score is "+c);
            } else {
                System.out.println("Computer wins!");
                u=u+1;
                System.out.println("computer score is "+u);
            }
        }
        System.out.println("Thank you for playing!");
        if(u>c){
            System.out.println("computer wins "+u);
        }
        else{
            System.out.println("you wins "+c);
        }
        scanner.close();
    }
}
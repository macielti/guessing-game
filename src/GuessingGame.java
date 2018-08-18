import java.util.Scanner;

public class GuessingGame {

    public static int randomNum() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String [] args){
        int number = randomNum();
        int guess = -1;
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.printf("I'm thinking of a number from 1 to 100, try to guess.");

        for (i = 1; i <= 10; i++) {
            System.out.printf("\nGuess: ");
            guess = scan.nextInt();

            if (guess == number) {
                System.out.println("Congratulations, you got it right.");
                break;
            } else if (guess > number)
                System.out.printf("It's smaller. %d attempts remaining", (10 - i));
            else if (guess < number)
                System.out.printf("it's bigger. %d attempts remaining", (10 - i));

        }

        if ( i > 10 )
            System.out.printf("\nNo more attempts, sorry.");
    }
}

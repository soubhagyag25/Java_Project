import java.util.Random;
import java.util.Scanner;

class Game
{
    public int number,input_number,noOfGuesses=0,score;
    Game()
    {
        System.out.println("Welcome to Guess the number Game");
        System.out.println("You have to guess between 0 to 1");
        Random rand=new Random();
        this.number=rand.nextInt(100);// it can store any value ranging from 0 to 100
    }
    void takeUserInput()
    {
        System.out.println("Guess the Number");
        Scanner inp=new Scanner(System.in);
        input_number=inp.nextInt();
    }
    boolean isCorrectNumber() {
        noOfGuesses++;
        if (input_number == number) {
            System.out.format("Hurray! You have Guessed the Number %d in %d attempts", number, noOfGuesses);

            if (noOfGuesses == 1) {
                System.out.println("You got 1000 points");
            } else {
                score = (1000 - (noOfGuesses * 50));
            }
            return true;
        } else if (input_number < number) {
            System.out.println("Too Small");
        } else {
            System.out.println("Too Large");
        }
        return false;

    }
}
public class Game_Day05 {
    public static void main(String[] args) {
        Game obj=new Game();
        boolean b=false;
        while(!b)
        {
            obj.takeUserInput();
            b=obj.isCorrectNumber();
        }
    }
}

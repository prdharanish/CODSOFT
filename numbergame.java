import java.util.Scanner;
import java.util.Random;
class numbergame{
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       Random random=new Random();
       int numbertoguess=random.nextInt(100)+1;
       int numberoftries=0;
       int guess;
       boolean win=false;
       int score=10;
       System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");
       System.out.println("I HAVE RANDOMLY CHOSEN A NUMBER BETWEEN 1 TO 100.");
       System.out.println("TRY TO GUESS IT..!");
       while(numberoftries<=10){
        System.out.println("Enter your guess:");
        guess=scan.nextInt();
        numberoftries++;
        score=score-1;
        System.out.println("score:"+score);
        if(guess<1 || guess >100){
            System.out.println("please enter between 1 to 100");
        }
        else if(guess<numbertoguess){
            System.out.println("It is higher than"+guess);
        }
        else if(guess>numbertoguess){
            System.out.println("It is lower than"+guess);
        }
        else{
            win=true;
            break;
        }
       } 
       if(win){
        System.out.println("congratulaions! you have guessed the number in "+numberoftries+"tries");
       }
       else{
        System.out.println("Sorry! you have used all attempts.The number was "+numbertoguess);
       } 
    }
} 
import java.util.Scanner;

public class bai8 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userGuess;
        int numberToGuess = (int)(Math.random()*99);
        int minGuess = 1;
        int maxGuess = 99;
        System.out.println(numberToGuess);
        do {
            if (maxGuess - minGuess == 2){
                System.out.println("Lose");
                break;
            }
            System.out.println("Enter a value between "+minGuess +" and "+ maxGuess);
            userGuess = sc.nextInt();
            if (userGuess>=minGuess && userGuess<=maxGuess){
                if (userGuess == numberToGuess){
                    System.out.println("Bingo!");
                }else if (userGuess<numberToGuess){
                    System.out.println("Too small!");
                    minGuess=userGuess;
                }else if (userGuess>numberToGuess){
                    System.out.println("Too large!");
                    maxGuess=userGuess;
                }
            }else{
                System.out.println("Out of range, try again?");
            }
        } while (userGuess!=numberToGuess);
    }
}

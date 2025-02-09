import java.util.Scanner;
import java.util.Random;
public class last{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(1,20), i =1;
        System.out.println("guess the number between 1-20, within 5 attempts !");
        System.out.print("enter your guess! : ");
        int guess = scan.nextInt();
        while(guess!=num && i<5){
            System.out.print("enter your guess! : ");
            guess = scan.nextInt();
            if(guess>num){
                System.out.println("try a smaller value !");}
            else if(guess==num){System.out.println("you win bro !!!");}
            else{System.out.println("try high !");}
            i++;

        }
        
        scan.close();

    }
}
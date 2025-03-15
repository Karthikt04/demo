import java.util.Scanner;
import java.util.Random;
//this comment is added thru github
// this is to check how del,merge ,recovery works!.
public class Nomain {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        boolean check = true;
        while(check){
            int rand = random.nextInt(1,4);
            String compare = numForRPS(rand);
            System.out.print("enter rock, paper or scissor ! : ");
            String choice = scan.nextLine().toUpperCase();
            if(compare.equals(choice)){
                System.out.println(compare+"\nTie....lets play again");
                check = true;
            }
            else if(choice.equals("ROCK")&&compare.equals("PAPER")){
                System.out.println(compare+"\nyou are out");
                check = true;
            }
            else if(choice.equals("PAPER")&&compare.equals("SCISSOR")){
                System.out.println(compare+"\nyou are out");
                check = true;
            }
            else if(choice.equals("SCISSOR")&&compare.equals("ROCK")){
                System.out.println(compare+"\nyou are out");
                check=true;
            }
            else{
                System.out.println(compare+"\nyou win :) ");
                check = false;
            }
        }

    }
    public static String numForRPS(int num){
        if(num==1){
            return "ROCK";
        }
        else if(num==2){
            return "PAPER";
        }
        else if(num==3){
            return "SCISSOR";
        }
        else{return null;}
    }
}

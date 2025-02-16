//package 
import java.util.Scanner;

public class set{
    static Scanner scan =new Scanner(System.in);
    public static void main(String args[]){
        String[] questions = {"what's your age ?","what's the currency of India ?","what's the national bird of India ?"};
        String[][] options ={{"1. 9","2. 10","3. 27","4. 19"},{"1. ruppees","2. dollar","3. pounds","4. yen"},{"1. penguin","2. sparrow","3. peacock","4. swan"}};
        int[] answers = {4,1,3};
        int input = 0,check = 0;
        System.out.println("###############################");
        System.out.println("   Welcome To Java Quiz Game   ");
        System.out.println("###############################");
        for(int i =0 ;i<questions.length;i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("enter your guess (1,2,3,4) : ");
            input = scan.nextInt();
            if(input==answers[i]){System.out.println("\n****correct****\n");check++;}
            else{System.out.println("\nwrong :(\n");}
        }
        System.out.printf("you have got %d/3 questions corret !\n\n",check);
                
        }
     
static void add(int... numbers){
    int sum = 0;
    for(int number : numbers){
        number -= number;
    }
    System.out.println(sum);
}
}


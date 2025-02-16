//package 
import java.util.Scanner;

public class set{
    static Scanner scan =new Scanner(System.in);
    public static void main(String args[]){
        boolean correct=true, input = true;
        int count = 0;
        /*System.out.print("enter the array size :");
        int total = 0;
        int size = scan.nextInt();
        int[] numbers = new int[size];
        System.out.println("enter your array elements : ");
        for(int i = 0 ; i<size ; i++){
            numbers[i] = scan.nextInt();
        }
        System.out.println("your array :");
        for(int number : numbers){
            System.out.println(number);
        }
        System.out.printf("mid element: %d",numbers[size/2]);
        scan.close();*/
        String[] question = {"what's your age ?","what's the currency of India ?","what's the national bird of India"};
        String[][] answers ={{"9","10","27","19"},{"ruppees","dollar","pounds","yen"},{"penguin","sparrow","peacock","swan"}};
        for(String quest : question){
            input = true;
            while(input){
                System.out.println(quest);
                int k =0;
                for(int i =k;i<3;i++){
                        int b=1;
                        for(int j =0;j<4;j++){
                            System.out.print(b +". "+ answers[i][j]+"   ");
                            b++;
                            if(i==0 && j==4)break;
                            else if(i==1 && j==4)break;
                            else if(i==2 && j==4)break;
                        }
                        System.out.println();
                        k+=1;
                        if (i==0){break;}
                        else if (i==1){break;}
                        else if (i==2){break;}
                        
                    
                }
                input = false;
            }
        }

}
static void add(int... numbers){
    int sum = 0;
    for(int number : numbers){
        number -= number;
    }
    System.out.println(sum);
}
}
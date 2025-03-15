import java.util.Scanner;
import java.util.Arrays;
public class Arraypract{
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        int[] number = {7,5,1,8,2,3,4,9};
        //int[] number1 = new int[10];
        char[] symbol;
        symbol = new char[] {'-'};
        int min = number[0];
        System.out.println("array content : "+Arrays.toString(number));
        for(int i = 0;i<number.length-1;i++){
            if(min > number[i]){
                min=number[i];}
        }
        System.out.print("minimum:"+min+"\n");
        /*for(int j = 0;j<number1.length;j++){
            System.out.print(number1[j]+" ");

        }*/
    }
}
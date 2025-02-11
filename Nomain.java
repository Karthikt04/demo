import java.util.Scanner;
//this comment is added thru github
// this is to check how del,merge ,recovery works!.
public class Nomain {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        /*System.out.print("enter the symbol: ");
        String symbol = scan.nextLine();
        System.out.print("enter the no of rows: ");
        int row = scan.nextInt();

        System.out.print("enter the no of columns: ");
        int columns = scan.nextInt();*/

        /*for(int i= 1 ; i<=5; i++){
            for(int j=0;j<i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        for(int i= 4 ; i>=1; i--){
            for(int j=0;j<i;j++){
                System.out.print("#");
            }
            System.out.println();
        }*/
        System.out.print("enter the 1st number : ");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.print("enter the operator : ");
        char operator = scan.next().charAt(0);
        System.out.print("enter the 2nd number : ");
        int num2 = scan.nextInt();
        if(operator=='+'){add(num1,num2);}
        else if(operator=='-'){sub(num1,num2);}
        else if(operator=='*'){mul(num1,num2);}
        else if(operator=='/'){div(num1,num2);}
        else if(operator=='%'){rem(num1,num2);}
        else System.out.println("enter a valid operator ! ");



        scan.close();
    }
    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    static void sub(int num1,int num2){
        System.out.println(num1-num2);
    }
    static void mul(int num1,int num2){
        System.out.println(num1*num2);
    }
    static void div(int num1,int num2){
        if(num2!=0){
        System.out.println(num1/num2);}
        else System.out.println("cannot divide by 0.");
    }
    static void rem(int num1,int num2){
        if (num2!=0){
        System.out.println(num1 % num2);}
        else System.out.println("cannot divide by 0.");
    }
}

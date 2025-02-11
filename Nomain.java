import java.util.Scanner;
//this comment is added thru github
// this is to check how del,merge ,recovery works!.
public class Nomain {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the symbol: ");
        String symbol = scan.nextLine();
        System.out.print("enter the no of rows: ");
        int row = scan.nextInt();

        System.out.print("enter the no of columns: ");
        int columns = scan.nextInt();

        for(int i= 0 ; i<row; i++){
            for(int j=0;j<columns;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        scan.close();
    }
}

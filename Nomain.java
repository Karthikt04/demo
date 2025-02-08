import java.util.Scanner;
//this comment is added thru github
// this is to check how del,merge ,recovery works!.
public class Nomain {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your item: ");
        String Item = scan.nextLine();
        System.out.print("enter price per item: $");
        double Price = scan.nextDouble();
        scan.nextLine();
        System.out.print("enter quantity: ");
        int Quantity = scan.nextInt();
        scan.nextLine();
        System.out.println("you have bought "+Quantity+" "+Item+"/s");
        System.out.println("your total price: $"+Quantity*Price);
        scan.close();
    }
}

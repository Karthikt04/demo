import java.util.Scanner;
public class last{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //String color = scan.nextLine();
        int salary, age;
        System.out.print("enter salary: ");
        salary = scan.nextInt();
        System.out.print("enter age: ");
        age = scan.nextInt();
        if(salary>=20000 || age <= 25){
            System.out.print("enter loan amount: ");
            int amount = scan.nextInt();
            if(amount<= 50000)
            System.out.println("you can avail loan.");
            else
            System.out.println("maximum loan amount is 50000 !");
        }
        else{
            System.out.println("not eligible");}
        scan.close();

    }
}
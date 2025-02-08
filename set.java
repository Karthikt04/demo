//package 
import java.util.Scanner;

public class set{
public static void main(String args[]){
    //System.out.println("hello world!");
    //String javStringContainer = "this is my first java file in vs code,i guess so!";
    //System.out.println(javStringContainer);
    Scanner scan = new Scanner(System.in);
    String name;
    double score;
    String department;
    System.out.print("enter your name: ");
    name = scan.nextLine();
    System.out.print("enter your score for 100: ");
    score = scan.nextDouble();
    scan.nextLine();
    System.out.print("enter your department: ");
    department = scan.nextLine();
    System.out.println("your score for 10 is:"+score/10);
    scan.close();
}}
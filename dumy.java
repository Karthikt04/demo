import java.util.Scanner;
public class dumy{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the initial investment : ");
        double iniInvestment = scan.nextDouble();

        System.out.print("enter the interest rate ( % ): ");
        double interestRate = scan.nextDouble();
        interestRate = interestRate/100;

        System.out.print("enter the no of times interest is compounded : ");
        double compound = scan.nextDouble();

        System.out.print("enter the total no of years : ");
        double year = scan.nextDouble();
        
        double result = iniInvestment * Math.pow((1+(interestRate/compound)),(compound*year));
        System.out.printf("your total compound interest after %.1f years is %.2f ", year, result);

        scan.close();
    }}
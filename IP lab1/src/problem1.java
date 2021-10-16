import java.util.Scanner;
public class problem1 {

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double int1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double int2 = scan.nextDouble();
        System.out.print("Enter the third number: ");
        double int3 = scan.nextDouble();
        scan.close();
        System.out.print("The average of entered numbers is:" + avr(int1, int2, int3) );
    }

  public static double avr(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}
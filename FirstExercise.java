import java.util.Scanner;


public class FirstExercise{
  public static void main(String[] args){
    int firstNumber, secondNumber, thirdNumber;
    int A, B, C, delta;
    double x1, x2; /* roots of a polynomial */
    
    Scanner firstScan = new Scanner(System.in);
    
    Scanner secondScan = new Scanner(System.in);
    Scanner thirdScan = new Scanner(System.in);
    
    System.out.println("Enter first number:");
    firstNumber = firstScan.nextInt();
    System.out.println("Enter second number:");
    secondNumber = secondScan.nextInt();
    System.out.println("Enter third number:");
    thirdNumber = thirdScan.nextInt();
    
    firstScan.close();
    secondScan.close();
    thirdScan.close();
    
    System.out.println("\nfirstNumber = "+firstNumber);
    System.out.println("secondNumber = "+secondNumber);
    System.out.println("thirdNumber = "+thirdNumber + "\n");
    
    A = firstNumber;
    B = secondNumber;
    C = thirdNumber;
    
    delta = (int) Math.pow(B, 2) - 4 * A * C;
    System.out.println("delta = " + delta + "\n");
    System.out.println("Polynomial: " + A + "x^2+" + B + "x+" + C + "\n");
    
    if (delta < 0)
      System.out.println("There are no roots in that polynomial");
    else if (delta == 0)
    {
      x1 = (-1) * B / (2 * A);
      System.out.println("Root equals: " + x1);
    }
    else if (delta > 0)
    {
      x1 = ((-1)*B + Math.sqrt(delta)) / (2 * A);
      x2 = ((-1)*B - Math.sqrt(delta)) / (2 * A);
      System.out.println("Roots equal: " + x1 + " and " + x2 + "\n");
    }
  }
}
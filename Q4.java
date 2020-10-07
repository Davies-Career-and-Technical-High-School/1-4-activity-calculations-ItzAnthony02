import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double twenty = 20;
      System.out.println("Enter a price");
      double entered =  scan.nextDouble();
      double result = 20 - entered;
      System.out.println("Change from the $20 will be " + "$" +result);
        /* Write your code here */

    }
}
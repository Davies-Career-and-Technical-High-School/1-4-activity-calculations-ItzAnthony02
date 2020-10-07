import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        /* Write your code here */
      System.out.println("Enter a number of inches you want to be converted to a whole number of feet");
      int inches = scan.nextInt();
      int feet = inches/12;
      System.out.print(feet);
    }
}
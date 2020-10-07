import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        /* Write your code here */
      double pi = 3.14; 
      System.out.println("Please enter a radius");
      double radius = scan.nextDouble();
      double circumference = (pi*2)*radius;
      double area = pi *(radius*radius);
      System.out.println("The circumference is " + circumference );
      System.out.println("The area is "+ area);
    }
}
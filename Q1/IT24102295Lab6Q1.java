import java.util.Scanner;
public class It24102295Lab6Q1 {
        public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
          System.out.print("Enter a number: ");
          double number=input.nextDouble();
          
          double square = number*number;
          double squareRoot = Math.sqrt(number);

          System.out.println("The Square of "+number+" is: "+square);
          System.out.println("The Square root of "+number+" is: "+squareRoot);
        }
}
        
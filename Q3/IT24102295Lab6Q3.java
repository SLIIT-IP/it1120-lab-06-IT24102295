import java.util.Scanner;
public class IT24102295Lab6Q3 {
      public static void main(String[] args) {

      int number;
      double meanOfSquares = 0;
      int count = 0;
      double sumOfSquares=0;

      Scanner input = new Scanner(System.in);
      System.out.println("Enter positive integers (terminate input with -99): ");
      while (true) {
          System.out.print("Enter a number: ");
          number = input.nextInt();

          if (number == -99) {
              break;
          }

          if (number > 0) {
               sumOfSquares += Math.pow(number,2);
               count=count+1;
          } 
          else {
               System.out.println("Invalid input.Please enter a positive integer or -99 to terminate");
          }
       }
       if (count > 0) {
           meanOfSquares = Math.sqrt(sumOfSquares/count);
           System.out.print("The Root Mean Square (RMS) is: "+meanOfSquares);
       }
       else {
           System.out.println("No valid numbers were entered.");
       }
       }
} 
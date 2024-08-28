import java.util.Scanner;
public class IT24102295Lab6Q2B {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        System.out.println("Please enter 10 numbers :");
        String numbers=""; 
        while (count <= 10) {
            System.out.print("Enter number "+count+":");
            int num = input.nextInt();
            numbers=numbers+num+" ";
            count=count+1;
        }
        System.out.println("The numbers you entered are :");
        System.out.println(numbers);

      }
} 
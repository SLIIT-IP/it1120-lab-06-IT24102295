import java.util.Scanner;
public class IT24102295Lab6Q2C {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int sum=0;
        double avg;

        System.out.println("Please enter 10 numbers :");
        String numbers=""; 
        while (count <= 10) {
            System.out.print("Enter number "+count+":");
            int num = input.nextInt();
            numbers=numbers+num+" ";
            sum=sum+num;
            count=count+1;
        }
        avg=sum/10;
        
        System.out.println("The numbers you entered are :");
        System.out.println(numbers);
        System.out.println("Sum of the numbers: "+sum);
        System.out.println("Average of the numbers: "+avg);
      }
} 
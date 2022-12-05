import java.util.Scanner;

public class Cube {
   public static void main(String args[]){
      int n = 5;
      System.out.println("Enter a number :- ");
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      System.out.println("Cube of the given number is "+(number*number*number));
   }
}
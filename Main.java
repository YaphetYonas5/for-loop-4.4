import java.util.Scanner; //Needed for Scanner class
class Main {
  public static void main(String[] args) {
    int maxValue;    // Maximum value to display

      // Create a Scanner object for keyboard input.
      Scanner console = new Scanner(System.in);

      System.out.println("Table of sequence and their logarithms.");

      // Get the maximum value to display.
      System.out.print("Enter last number : ");
      maxValue = console.nextInt();

      for (int i = 1; i <= maxValue; i++)
      {
         System.out.println(i + "\t" + Math.log(i));
      }
  }
}
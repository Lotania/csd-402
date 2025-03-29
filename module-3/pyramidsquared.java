//Anthony Nguyen, M3 Assignment
//The purpose of the program is to demonstrate nested loops in Java
//This program has 4 for loops nested within the overall for loop

public class pyramidsquared {
  public static void main(String[] args) {
    //required output goes to 64 on row 7
    int rows = 7; 
    
    //outer for loop will go until row 7
    for (int i = 1; i <= rows; i++) {
      // Print leading spaces
      for (int j = 1; j <= rows - i; j++) {
        System.out.print("\t");
      }
      // Print ascending numbers
      // using 2^(n-1) for row 1
      for (int k = 1; k <= i; k++) {
        //this loop will continue until it reaches the current row number
        double step = Math.pow(2, (k-1));
        //Math.pow turns everything into a double, which will mangle the desired output
        int nextStep = (int) step;
        //cast to int to keep all columns neat
        System.out.print(nextStep + "\t");
      }
      // Print descending numbers
      for (int l = i - 1; l >= 1; l--) {
        //this loop will continue one row below the current row number
        double step = Math.pow(2, (l-1));
        int nextStep = (int) step;
        System.out.print(nextStep + "\t");
      }
      for (int l = rows; l >= i; l--) {
        //this loop will tab until it reaches a certain point (current row number)
        System.out.print("\t");
      }
      System.out.print("@");//marks the end of the row. all @ are in the same column
      System.out.println();//NEXT
    }
  }
}

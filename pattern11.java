/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main{
	public static void main(String[] args) {
	       Scanner scn = new Scanner(System.in);
	       int n=scn.nextInt();
	         for (int i = 0; i < n; i++) {
            // Inner loop for printing spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); // Two spaces for formatting
            }

            // Inner loop for printing asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("*   "); // Three spaces for formatting
            }

            // Move to the next line
            System.out.println();
        }
	}
}

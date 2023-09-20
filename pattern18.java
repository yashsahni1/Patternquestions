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
	     
        // Print the top half of the pattern
        for (int i = 1; i <= n; i += 2) {
            // Print leading spaces
            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }
        
        // Print the bottom half of the pattern
        for (int i = n - 2; i >= 1; i -= 2) {
            // Print leading spaces
            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }
	}
}

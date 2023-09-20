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
	         
        // Loop to print the upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces before the asterisks
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            
            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            
            System.out.println(); // Move to the next line
        }
        
        // Loop to print the lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before the asterisks
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            
            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            
            System.out.println(); // Move to the next line
        }
	}
}

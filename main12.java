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
            // Print spaces before the stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("   "); // Three spaces for alignment
            }

            // Print stars and exclamation marks
            for (int k = 0; k < i * 2 + 1; k++) {
                if (k % 2 == 0) {
                    System.out.print("*  ");
                } else {
                    System.out.print("!  ");
                }
            }

            // Move to the next line
            System.out.println();
        }
	}
}

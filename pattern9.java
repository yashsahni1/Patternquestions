/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n=scn.nextInt();
              
    for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("   "); // Three spaces for each space
            }

            // Print asterisks
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" * ");
            }

            // Move to the next line
            System.out.println();
        }
	}
}

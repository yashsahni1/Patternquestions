/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int n = 3; // Change this value to control the number of rows

        for (int i = 0; i < n; i++) {
            // Print spaces before the numbers
            for (int j = 0; j < n - i-1; j++) {
                System.out.print(" ");
            }

            // Print the numbers
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(1);
            }

            System.out.println(); // Move to the next line
        }
    
	}
}

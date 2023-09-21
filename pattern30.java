import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();// Change this value to control the number of rows

        for (int  i= 0; i < n; i++) {
            // Print spaces before the numbers
            for (int j = n; j >=1; j--) {
                System.out.print(j);
            }

            // Print the numbers
           

            System.out.println(); // Move to the next line
        }
    
	}
}

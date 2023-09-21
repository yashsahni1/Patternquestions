import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();// Change this value to control the number of rows

        for (int  i= 1; i <= n; i++) {
            // Print spaces before the numbers
            for (int j = n; j >=i; j--) {
                if(j>i){
                System.out.print(j);
            }else{
                System.out.print("*");
            }
            }
    for(int j=i-1;j>=1;j--){
         System.out.print(j);
    }
            // Print the numbers
           

            System.out.println(); // Move to the next line
        }
    
	}
}

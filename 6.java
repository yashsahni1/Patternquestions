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
	for(int i=0;i<n;i++){
	    for(int j=0;j<2*i;j++){
	            System.out.print(" ");
	        }
	        for(int k=0;k<n-i;k++){
	            System.out.print("*");
	        }
	    System.out.println();
	}
	}
}

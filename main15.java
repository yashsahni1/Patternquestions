/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {

       Scanner scn= new Scanner(System.in);
       int n=scn.nextInt();
       int star=n;
       int space=0;
       for(int i=1;i<=2*n-1;i++){
           for(int j=1;j<=space;j++){
               System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
        }
    }
}

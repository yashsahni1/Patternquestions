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
       int star=n/2;
       int space=1;
       for(int i=1;i<=n;i++){
             for(int j=1;j<=star;j++){
                System.out.print("*");
             }
           for(int j=1;j<=space;j++){
               System.out.print("  ");
            }
             for(int j=1;j<=star;j++){
                System.out.print("*");
             }
            
             
            System.out.println();
            if(i<=n/2){
                star--;
                space++;
            }else{
                star++;
                space--;
            }
        }
    }
}

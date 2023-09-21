/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        // Question 20
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n/2;
        for(int row=1;row<=n;row++){
            // space
            for(int i=1;i<=space;i++){
                System.out.print(" ");
            }
            // star
            for(int i=1;i<=star;i++){
                if(i==1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }

            // 2nd Half
            // star
            for(int i=2;i<=star;i++){
                if(i==star){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            // space
            for(int i=1;i<=space;i++){
                System.out.print(" ");
            }

            if(row<=n/2){
                space--;
                star++;
            }else{
                star--;
                space++;
            }
            System.out.println();
        }


    }
}

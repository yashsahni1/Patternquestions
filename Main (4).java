/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	int n=5;
	int space=4;
	int star=1;
	for(int i=1;i<=5;i++){
	    for(int j=1;j<=space;j++){
	        System.out.print(" ");
	    }
	    for(int j=1;j<=star;j++){
	        if(j==1 || j==star)
	        System.out.print(i);
	        else
	        System.out.print(0);
	    }
	    System.out.println();
	    star+=2;
	    space--;
	}
	}
}

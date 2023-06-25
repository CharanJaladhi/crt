/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class removeduplicates
{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		    arr[i]=inp.nextInt();
	    for(int i=0;i<n;i++){
	        int c=0;
	        for(int j=0;j<n;j++){
	            if (i!=j){
	                if(arr[i]==arr[j])
	                    c=1;
	            }
	        }
	        if(c==0)
	            System.out.print(arr[i]+" ");
	    }
	}
}

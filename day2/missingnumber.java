/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class missingnumber
{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int a=inp.nextInt();
		int []arr=new int[a];
		for(int i=0;i<a;i++){
		    arr[i]=inp.nextInt();
		}
		int b=0;
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++){
		    if(arr[i]-arr[i-1]!=1)
		    b=arr[i-1]+1;
		}
		System.out.println("missing number:"+b);
	}
}

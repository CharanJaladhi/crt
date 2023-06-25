/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class reversewords
{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String a=inp.nextLine();
		String arr[]=a.split(" "); 
		for(int i=arr.length-1;i>=0;i--)
		    System.out.print(arr[i]+" ");
	}
}

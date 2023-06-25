/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class prefixcommonsub
{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		inp.nextLine();
		String []arr=new String[n];
		for(int i=0;i<n;i++){
		arr[i]=inp.nextLine();
		}
		int z=arr[0].length();
		for(int i=0;i<z;i++){
		    int flag=0;
		    for(int j=1;j<n;j++){
		        if(arr[j-1].charAt(i)!=arr[j].charAt(i)){
		            flag=1;
		        }
		    }
		    if(flag==0)
		        System.out.print(arr[i].charAt(i));
		}
		
	}
}

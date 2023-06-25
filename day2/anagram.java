/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class anagram
{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int []arr=new int[26];
		int []arr1=new int[26];
		String a=inp.nextLine();
		String b=inp.nextLine();
		String a2=a.replaceAll(" ","");
		String b2=b.replaceAll(" ","");
		
		if(a2.length()!=b2.length())
		    System.out.println("It is not anagram");
		else{
		    String a1=a2.toLowerCase();
		    String b1=b2.toLowerCase();
		    for(int i=0;i<a1.length();i++){
		        arr[a1.charAt(i)-97]+=1;
		    }
		    for(int i=0;i<b1.length();i++){
		        arr1[b1.charAt(i)-97]+=1;
		    }
		    int flag=0;
		    for(int i=0;i<26;i++){
		        if(arr[i]!=arr1[i])
		            flag+=1;
		    }
		    if(flag==0)
		        System.out.println("It is  anagram");
		    else
		        System.out.println("It is not anagram");
		}
	}
}

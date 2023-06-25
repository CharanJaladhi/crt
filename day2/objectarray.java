/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class objectarray
{
	/*public static int fmax(int arr[]){
	    int max=arr[0];
	    for(int i=1;i<arr.length;i++){
	        if(max<arr[i])
	            max=arr[i];
	    }
	    return max;
	}
	public static void main(String[] args) {
	    int []arr1={1,2,3,4,5,6,7,8,9};
	    int num=fmax(arr1);
	    System.out.println(num);*/
	    objectarray(int id,String name){
	    System.out.println("id:"+ id+ "name:"+name);}
	    public static void main(String args[]){
	        objectarray ob[]=new objectarray[3];
	        ob[0]=new objectarray(1,"charan");
	        ob[1]=new objectarray(2,"Shannu");
	        ob[2]=new objectarray(3,"ch");
	    }
	

}

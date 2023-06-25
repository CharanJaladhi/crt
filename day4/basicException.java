import java.util.*;
public class basicException{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       try{
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The value is:"+a/b);
    }catch(Exception E){
        System.out.println("we cant divide with 0");}
    }
} 
import java.util.*;
class leftrecursion{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        String s=inp.nextLine();
        String s1="";
        int k=inp.nextInt();
        for(int i=k;i<s.length();i++)
            s1+=s.charAt(i);
        for(int i=0;i<k;i++){
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}

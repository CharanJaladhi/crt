import java.util.*;
public class targetsum{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=inp.nextInt();
        int target=inp.nextInt();

        
        for (int i = 0; i < n; i++){
            for (int j = i+1; j<n; j++){
                if(arr[i]+arr[j]==target)
                    System.out.println(i+" "+j);
            }
        }
    }
}
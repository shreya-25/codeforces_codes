import java.util.*;
import java.io.*;

public class check_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<Integer>();
        //int arr[]=new int[n];
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        int flag=0;
        for(int i=0;i<n;i++)
            set.add(sc.nextInt());
        for(int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();
        for(int i:arr1)
        {
            if(!set.contains(i))
            {
                System.out.println("No");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Yes");
    }
}

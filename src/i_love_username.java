import java.util.*;
import java.io.*;

public class i_love_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int min=arr[0],max=arr[0], count=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                count++;
                max=arr[i];
            }
            else if(arr[i]<min)
            {
                count++;
                min=arr[i];
            }

        }
        System.out.println(count);
    }
}

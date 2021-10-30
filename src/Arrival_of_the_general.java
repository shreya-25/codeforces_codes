import java.util.*;
import java.io.*;

public class Arrival_of_the_general {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int swaps=0;
        int max=arr[0],maxpos=0,min=arr[0],minpos=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxpos=i;
            }
        }
        for(int i=maxpos-1;i>=0;i--)
        {
            arr[i+1]=arr[i];
            swaps++;
        }
        arr[0]=max;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<=min) {
                min = arr[i];
                minpos = i;
            }
        }
        System.out.println(swaps+n-1-minpos);

    }
}

import java.util.*;
import java.io.*;

public class count_occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);

    }
}

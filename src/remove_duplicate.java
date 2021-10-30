import java.util.*;
import java.io.*;

public class remove_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int n1=sc.nextInt();
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<n;i++)
            set.add(sc.nextInt());
        for(int i=0;i<n1;i++)
            set.add(sc.nextInt());
        for(int i:set)
            System.out.println(i);

    }
}

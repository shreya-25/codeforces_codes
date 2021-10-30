import javax.naming.PartialResultException;
import java.util.*;
import java.io.*;

public class bucket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>al=new ArrayList<Integer>();
        while(n>0)
        {
          al.add(n%10);
          n=n/10;
        }
        Collections.sort(al);
        int len=al.size()-1;
        int n1=0,n2=0;
        for(int i=len;i>=0;i--)
        {
            n1+=Math.pow(10,i)*al.get(i);
            n2+=Math.pow(10,len-i)*al.get(i);
        }
        System.out.println(n1+n2);
    }
}

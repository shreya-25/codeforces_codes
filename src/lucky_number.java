import java.util.*;
import java.io.*;

public class lucky_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long c=0;
        while(n!=0)
        {
            long r=n%10;
            n=n/10;
            if(r==4 || r==7)
               c++;
        }
        int flag=0;
        if(c==0)
            flag=1;
        while(c!=0)
        {
            long r=c%10;
            if(r!=4 && r!=7)
            {
                flag=1;
                break;
            }
            c=c/10;
        }
        if(flag==1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}

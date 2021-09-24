import java.util.*;
import java.io.*;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        sc.nextLine();
        String str= sc.nextLine();
        char ch[]= str.toCharArray();
        for(int i=0;i<t;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(ch[j-1]=='B' && ch[j]=='G')
                {
                    ch[j-1]='G';
                    ch[j]='B';
                    j++;
                }
            }
        }
        for(char c:ch)
        System.out.print(c);
    }
}

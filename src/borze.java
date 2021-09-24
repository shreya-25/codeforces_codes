import java.util.*;
import java.io.*;

public class borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int flag=0;
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='-' && s.charAt(i+1)=='.')
            {
                if(i==s.length()-2)
                   flag=1;
                i++;
                str.append(1);
            }
            else if(s.charAt(i)=='-' && s.charAt(i+1)=='-')
            {
                if(i==s.length()-2)
                    flag=1;
                i++;
                str.append(2);
            }
            else
                str.append(0);
        }
        if(flag==0)
            str.append(0);
        System.out.println(str);
    }
}

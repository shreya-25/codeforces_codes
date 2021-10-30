import java.util.*;
import java.io.*;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            res+=s.charAt(i);
        }
        System.out.println(res);
    }
}
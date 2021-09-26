import java.util.*;
import java.io.*;

public class UltraFast_Mathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        StringBuilder res= new StringBuilder("");
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
                res.append("0");
            else
                res.append("1");
        }
        System.out.println(res);
    }
}

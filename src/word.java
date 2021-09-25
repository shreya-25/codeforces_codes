import java.util.*;
import java.io.*;

public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int lower=0,upper=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&& s.charAt(i)<='z')
                lower++;
            else
                upper++;
        }
        if(upper>lower)
            s=s.toUpperCase();
        else
            s=s.toLowerCase();

         System.out.println(s);
    }
}

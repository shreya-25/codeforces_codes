import java.util.*;
import java.io.*;

public class stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int c=0;
        Stack<Character>st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty() || st.peek()!=s.charAt(i))
                st.add(s.charAt(i));
            else
                c++;
        }
        System.out.println(c);
    }
}

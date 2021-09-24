import java.util.*;
import java.io.*;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        int n=sc.nextInt();
        for(int i=n+1;i<9500;i++)
        {
            set.clear();
            int temp=i;
            while(temp!=0)
            {
                set.add(temp%10);
                temp=temp/10;
            }
            if(set.size()==4)
            {
                System.out.println(i);
                break;
            }
        }

    }
}

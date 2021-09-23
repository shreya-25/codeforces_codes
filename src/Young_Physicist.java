

import java.util.*;
import java.io.*;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int sum_x=0,sum_y=0,sum_z=0;
        for(int i=0;i<t;i++)
        {
            sum_x+=sc.nextInt();
            sum_y+=sc.nextInt();
            sum_z+=sc.nextInt();
        }
        if(sum_x==sum_y && sum_y==sum_z && sum_z==0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}

import java.util.*;
import java.io.*;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0,y=0;
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=4;j++)
            {
                if(sc.nextInt()==1)
                {
                    x=i;
                    y=j;
                }
            }
        }
        int ans= Math.abs(x-2)+Math.abs(y-2);
        System.out.println(ans);

    }
}

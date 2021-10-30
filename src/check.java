import java.util.*;
import java.io.*;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();

        int d=input2-input1;
        int a= input1-d;
        int n= a+ (input3-1)*d;
        System.out.println(n);

    }
}

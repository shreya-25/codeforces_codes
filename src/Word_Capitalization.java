import java.util.*;
import java.io.*;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        str= str.substring(0,1).toUpperCase() + str.substring(1);
        System.out.println(str);
    }
}

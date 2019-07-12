import java.io.*;
import java.util.*;

public class StringPalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=new String();
        A = sc.next();
        char[] c = A.toCharArray(); 
        StringBuilder sb = new StringBuilder(); 
        for(int i=A.length()-1;i>=0;i--)
        {
        	sb.append(c[i]);
        }
        String s = sb.toString();
        if(A.equals(s))
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
    }
}





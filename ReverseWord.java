import java.util.*;
import java.io.*;
public class ReverseWord {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=new String();
        s1=s.next();
        char ch[]=s1.toCharArray();
        char ch1[] =new char[ch.length];
        int n=ch.length-1;
        int j=n;
        for(int i=0;i<ch.length;i++)
        {
            {
                ch1[j]=ch[i];
                --j;
            }
        }
        for(int i=0;i<=n;i++)
        {
            System.out.print(ch[i]);
        }
        System.out.println();
        for(int i=0;i<=n;i++)
        {
            System.out.print(ch1[i]);
        }
    }
    
}

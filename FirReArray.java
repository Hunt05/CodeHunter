import java.io.*;
import java.util.*;

public class RepeatedArray
{
    public static void main(String args[])
    {
        int a[]=new int[args.length];
        int flag=0,n=args.length;
        
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j]&&flag==0)
                {
                    flag=1;
                    System.out.println("Repeated Element:"+a[i]);
            
                }
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class UniEleArray
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
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
            
                if(a[i]!=a[j])
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                    break;
                }
                }
            }
            if(flag==1)
            {
                System.out.println("Unique Element:"+a[i]);
            }
        }
    }
}

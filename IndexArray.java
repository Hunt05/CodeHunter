import java.io.*;
import java.util.*;
public class IndexArray 
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,i,j;
System.out.print("Enter the size of the array ");
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;i<n;j++)
{
if(a[i]>a[j])
{
int t=a[i];
a[i]=a[j];
a[j];=t;
System.out.println(a[i]+" ");
}
}
}
for(i=0;i<n;i++)
{
if(a[i]==i)
{
System.out.println(a[i]+" ");
}
else
{
System.out.println("nothing found");
}
}
}
}

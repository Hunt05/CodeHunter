import java.io.*;
import java.util.*;
public class LeastNo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=new String();
s1=s.next();
char ch[]=s1.toCharArray();
int k=0;
for(int i=0;i<s1.length();i++)
{
for(int j=i+1;j<s1.length();j++)
{
if(ch[i]>ch[j])
{
char t=ch[i];
ch[i]=ch[j];
ch[j]=t;
}
}
}
System.out.print(ch[k]);
System.out.print(ch[k+1]);
}
}



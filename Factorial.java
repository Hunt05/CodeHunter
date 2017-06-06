import java.io.*;
import java.util.*;

public class Factorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n1=new int();
n1=s.nextInt();
int fact=0;
for(int i=0;i<=n1;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}

import java.io.*;
import java.util.*;

public class ReverseString
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=new String();
s1=s.next();
StringBuffer s2=new StringBuffer(s1);
System.out.println(s2.reverse());
}
}

import java.util.*;
import java.lang.*;
import java.io.*;
class reverse
{
   public static void main (String[] args) throws java.lang.Exception
   {
     String s1;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the string to be reversed:");
     s1=in.nextLine();
     StringBuilder sb=new StringBuilder();
     sb.append(s1);
     sb=sb.reverse();
     System.out.println("Reversed String:");
     System.out.println(sb);
   }
}

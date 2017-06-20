import java.util.*;
import java.lang.*;
import java.io.*;
class count
{
   public static void main (String[] args) throws java.lang.Exception
   {
     int num,n;
     Scanner in= new Scanner(System.in);
     System.out.println("Enter the number:");
     num=in.nextInt();
     n=Integer.toString(num).length();
     System.out.println("Total count of integers in a given number:"+n);
  }
}

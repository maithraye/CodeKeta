import java.util.*;
import java.lang.*;
import java.io.*;
class oddeven
{
   public static void main (String[] args) throws java.lang.Exception
   {
     int num;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the number to be checked:");
     num=in.nextInt();
     if(num%2==0)
     {
       System.out.println("Even Number");
     }
     else
     {
       System.out.println("Odd Number");
     }
  }
}

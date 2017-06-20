import java.util.*;
import java.lang.*;
import java.io.*;
class number
{
   public static void main (String[] args) throws java.lang.Exception
   {
     int num;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the number to be checked:");
     num=in.nextInt();
     if(num>0)
     {
       System.out.println("Positive Number");
     }
     else if(num<0)
     {
       System.out.println("Negative Number");
     }
     else
     {
       System.out.println("Zero");
     }
  }
}

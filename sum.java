import java.util.*;
import java.lang.*;
import java.io.*;
class sum
{
   public static void main (String[] args) throws java.lang.Exception
   {
     int sum=0,n;
     Scanner in= new Scanner(System.in);
     System.out.println("Enter the number:");
     n=in.nextInt();
     for(int i=1;i<=n;i++)
     {
       sum+=i;
     }
     System.out.println("Sum of natural numbers:"+sum);
  }
}

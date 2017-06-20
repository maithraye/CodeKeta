import java.util.*;
import java.lang.*;
import java.io.*;
class natural
{
   public static void main (String[] args) throws java.lang.Exception
   {
     int n,num;
     Scanner in= new Scanner(System.in);
     System.out.println("Enter the number:");
     n=in.nextInt();
     num=n*(n+1);
     num=num/2;
     System.out.println("Sum of natural numbers:"+num);
  }
}

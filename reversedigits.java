import java.util.*;
import java.lang.*;
import java.io.*;
class reversedigits
{
   public static void main (String[] args) throws java.lang.Exception
   {
     int n,reverse=0;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the number:");
     n=in.nextInt();
     while(n!=0)
     {
        reverse=reverse*10;
        reverse=reverse+n%10;
        n=n/10;
     }
     System.out.println("Reverse of given number:"+reverse);
   }
}

import java.io.*;
import java.util.*;
public class primecount
{
 public static void main(String[] args)
 {
   int n,n1;
   int flag=0,count=0;
   System.out.println("Enter the range of numbers:");
   Scanner in=new Scanner(System.in);
   n=in.nextInt();
   n1=in.nextInt();
   System.out.println("Prime Numbers:");
   for(int i=n;i<=n1;i++)
   {
     for(int j=2;j<i;j++)
     {
        if(i%2==0)
        {
          flag=0;
          break;
        }
        else
        {
          flag=1;
        }
     }
     if(flag==1)
     {
       System.out.println(+i);
       count++;
     }
   }
   System.out.println("Total count of prime numbers:"+count);
  }
}

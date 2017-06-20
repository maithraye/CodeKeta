import java.util.*;
import java.lang.*;
import java.io.*;
class leapyear
{
   public static void main (String[] args) throws java.lang.Exception
   {
     int year;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the year to be checked:");
     year=in.nextInt();
     if(year%4==0&&year%100!=0)
     {
       System.out.println( + year + " is leap year");
     }
     else
     {
       System.out.println(+ year + " is not a leap year");
     }
  }
}

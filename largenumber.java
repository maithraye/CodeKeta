import java.util.*;
import java.lang.*;
import java.io.*;
class largenumber
{
   public static void main (String[] args) throws java.lang.Exception
   {
     int num1,num2,num3;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the first number:");
     num1=in.nextInt();
     System.out.println("Enter the second number:");
     num2=in.nextInt();
     System.out.println("Enter the third number:");
     num3=in.nextInt();
     if(num1>num2&&num1>num3)
     {
       System.out.println(+ num1 + " is largest number");
     }
     else if(num2>num1&&num2>num3)
     {
       System.out.println(+ num2 + " is largest number");
     }
     else
     {
       System.out.println(+ num3 + " is largest number");
     }
  }
}

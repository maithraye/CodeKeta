import java.util.*;
import java.lang.*;
import java.io.*;
class alphabet
{
   public static void main (String[] args) throws java.lang.Exception
   {
     char letter;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the letter to be checked:");
     letter=in.next().charAt(0);
     if(letter>=65&&letter<=90||letter>=97&&letter<=122)
     {
       System.out.println("It is an alphabet");
     }
     else
     {
       System.out.println("It is not an alphabet");
     }
  }
}

import java.util.*;
import java.lang.*;
import java.io.*;
class vowel
{
   public static void main (String[] args) throws java.lang.Exception
   {
     char letter;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the letter to be checked:");
     letter=in.next().charAt(0);
     if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
     {
       System.out.println("It is a Vowel");
     }
     else
     {
       System.out.println("It is a consonant");
     }
  }
}

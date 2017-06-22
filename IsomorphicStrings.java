import java.util.*;
import java.lang.*;
import java.io.*;
class IsomorphicStrings
{
   public static void main (String[] args) throws java.lang.Exception
   {
      IsomorphicStrings iso = new IsomorphicStrings();
            String a = "egg";
            String b = "add";
            String c = "foo";
            String d = "bar";
            String e = "paper";
            String f = "title";
            System.out.println("egg add:"+iso.isIsomorphic(a,b));
            System.out.println("foo bar:"+iso.isIsomorphic(c,d));
            System.out.println("paper title:"+iso.isIsomorphic(e,f));
   }
   public boolean isIsomorphic(String a, String b) {
                if(a == null || b == null) {
                        return false;
                }
                if(a.length() != b.length()) {
                        return false;
                }
                Map<Character, Character> characterMap = new HashMap<Character, Character>();
                for(int i=0; i<a.length(); i++) {
                        char c1 = a.charAt(i);
                        char c2 = b.charAt(i);
                        if(characterMap.containsKey(c1)) {
                                if(characterMap.get(c1) != c2) {
                                        return false;
                                }
                        } else {
                                if(characterMap.containsValue(c2)) {
                                        return false;
                                }
                                characterMap.put(c1, c2);
                        }
                }
                return true;
        }
}

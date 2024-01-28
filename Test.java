
// program to extract username and domain from a email id and confirm that the given email id belongs to gmail domain.

import java.lang.*;
import java.util.*;
class Test
 {
   public static void main(String [] args)
   {

      String str = "programmer@gmail.com";

      int index = str.indexOf("@");
      String uname = str.substring(0,index);
      String domain = str.substring(index+1,str.length());
      System.out.println("UserName:"+uname);
      System.out.println("Domain:"+domain);
      boolean b = domain.startsWith("gmail");
      System.out.println(b);
    }
}
    
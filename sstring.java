//remove extra space from string

import java.lang.*;


class sstring
     {   
        public static void main(String [] args)
     {
       String str = "   abc  def  ghi";
       String str1 = str.replaceAll("\\s", "").trim();  // trim() for removing heading or trailing spaces
       System.out.println(str1);
     }
}
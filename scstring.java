
//remove special character from string

import java.lang.*;


class scstring
     {   
        public static void main(String [] args)
     {
       String str = "1ABC23T3@#!2";
       String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
       System.out.println(str1);
     }
}
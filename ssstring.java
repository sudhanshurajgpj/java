// count number of words in string


import java.lang.*;


class ssstring
     {   
        public static void main(String [] args)
     {
       String str = " abc  def  ghi  ";
       str = str.replaceAll("\\s", "").trim();  // trim() for removing heading or trailing spaces
       String words[]=str.split("\\s");
       System.out.println(words.length);
     }
}
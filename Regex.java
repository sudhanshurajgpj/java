// checking given number is binary or not

import java.lang.*;
import java.util.Scanner;


class Binary
{
 public static void main(String [] args)
   {
     int a=1000110;
     String str = String.valueOf(a);
  
   System.out.println(str.matches("[01]+"));
}
}
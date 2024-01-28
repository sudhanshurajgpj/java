/*program to print pattern
()()()()()
()()()()()
()()()()()
()()()()()
()()()()() */

import java.lang.*;
import java.util.Scanner;


class pattern1
  {
     public static void main(String [] args)
       { 
         for (int i =0;i<=5;i++)
           {
             for(int j =0;j<=5;j++)
              System.out.print("("+i+","+j+")");
            }
              System.out.println(" ");
         }
}
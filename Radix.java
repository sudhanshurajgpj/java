// program to find radix of a number

import java.lang.*;
import java.util.Scanner;


class Radix
{

   public static void main(String [] args)
    {

       String num;
       System.out.println("Please enter a no.:");
       Scanner kb = new Scanner(System.in);
       num = kb.nextLine();

      if(num.matches("[01]+"))
       {
         System.out.println("Binary Radix is 2");
       }
       else if(num.matches("[0-7]+"))
       {
         System.out.println("Octal radix is 8");
       }
        else if (num.matches("[0-9]+"))
        {
          System.out.println("Decimal radix is 10");
        }
         else if (num.matches("[0-9A-F]+"))
         {
           System.out.println("Radix is 16");
          }
         else
          {
           System.out.println("Not a number");
           } 
   }
}
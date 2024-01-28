//Swapping number without third variable using arithmetic operator

import java.lang.*;
import java.util.Scanner;


class swap
{
 public static void main(String [] args)
   {
     int a=10,b=15;
   

     a=a+b;
     b=a-b;
     a=a-b;
   
   System.out.println(a+ " "+b);
}
}
//program to split the digit

import java.lang.*;
import java.util.Scanner;

class splitDigit
   {
     public static void main(String [] args)
     {
       int n;
       System.out.println("Enter the no.:");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       int r;
       while(n>0)
       {
         r = n%10;
         n = n/10;
        System.out.println(r);
        }
      }
}
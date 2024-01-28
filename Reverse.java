// program to print reverse of a no.

import java.lang.*;
import java.util.Scanner;

class Reverse
    {
      public static void main(String [] args)
       {
          int n ;
          System.out.println("Enter the no. to reverse:");
          Scanner kb = new Scanner(System.in);
          n = kb.nextInt();
          int r;
          int rev = 0;
          while(n>0)
             {
                r = n%10;
                rev = rev*10+r;
                n = n/10;
              }
         System.out.println(rev);
       }
}

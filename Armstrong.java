// program to find Armstrong no.(individual digit sum of a no. equal to that no. is Armstrong no.)

import java.lang.*;
import java.util.Scanner;

class Armstrong
  {
    public static void main(String [] args)
    {
      int n;
      System.out.println("Enter the no. to check:");
      Scanner kb = new Scanner(System.in);
      n = kb.nextInt();
      int temp =n;
      int sum =0;
      int r;
      while (n>0)
      {
       r = n%10;
       sum = sum+(r*r*r);
       n = n/10;
      }
      if(temp == sum)
         {
           System.out.println("Armstrong no.");
         }
         else 
          {
            System.out.println("Not Armstrong no.");
          }
     }
}
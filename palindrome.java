// Program to check palindrome

import java.lang.*;
import java.util.Scanner;

class palindrome
  {
     public static void main(String [] args)
      {
        int n;
        System.out.println("Please enter the no. to check:");
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int r;
        int temp =n;
        int rev=0;
        while(n>0)
        {
          r = n%10;
          rev = rev*10+r;
          n = n/10;
        }
         if (temp == rev)
         {
           System.out.println("Palindrome no.");
          }
        }
}
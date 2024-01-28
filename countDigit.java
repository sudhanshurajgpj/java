// program to count digit of the no.
  

import java.lang.*;
import java.util.Scanner;

class countDigit
  {
     public static void main(String [] args)
      {
        int n;
        System.out.println("Enter the no.:");
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int count =0;
        while(n>0)
        {
          n=n/10;
          count++;
        }
        System.out.println(count);
       }
}
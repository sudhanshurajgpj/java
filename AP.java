// program to print AP

import java.lang.*;
import java.util.Scanner;


class AP
  {
     public static void main(String [] args)
       {
         int start,common_diff,n;
         System.out.println("Enter the no. of terms you want to print:");
         Scanner kb = new Scanner(System.in);
         n = kb.nextInt();
         System.out.println("Enter the start term:");
         start = kb.nextInt();
         System.out.println("Enter the common_diff:");
         common_diff = kb.nextInt();
         int term = start;
         for(int i =0;i<n;i++)
          {
            System.out.print(term+",");
            term = term+ common_diff;
           }
        }
}
         

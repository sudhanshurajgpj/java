// program to print GP


import java.lang.*;
import java.util.Scanner;


class GP
  {
     public static void main(String [] args)
       {
         int start,ratio,n;
         System.out.println("Enter the no. of terms you want to print:");
         Scanner kb = new Scanner(System.in);
         n = kb.nextInt();
         System.out.println("Enter the start term:");
         start = kb.nextInt();
         System.out.println("Enter the ratio:");
         ratio = kb.nextInt();
         int term = start;
         for(int i =0;i<n;i++)
          {
            System.out.print(term+",");
            term = term * ratio;
           }
        }
}

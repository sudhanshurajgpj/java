// program to print Fibonacci series


import java.lang.*;
import java.util.Scanner;


class fibonacci
  {
     public static void main(String [] args)
       {
         int n,c;
         int a =0;
         int b =1;
         System.out.println("Enter the no. of terms you want to print:");
         Scanner kb = new Scanner(System.in);
         n = kb.nextInt();
         System.out.print(a+","+b+",");
         for(int i =0; i<n-2;i++)
          {
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+",");
          }
        }
}
     
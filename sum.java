//sum of n natural no.

import java.lang.*;
import java.util.Scanner;

class sum
{
  public static void main(String [] args)
    {
      int n;
      System.out.println("Enter the no. you want to sum:");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int sum = 0;
      for(int i=0;i<=n;i++)
       {
         sum = sum + i;
       }
     System.out.println("Sum of "+n+" natural no. is :"+sum);
     }
}
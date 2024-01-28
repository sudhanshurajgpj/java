// program to print table 

import java.lang.*;
import java.util.Scanner;

class table
{
   public static void main(String [] args)
    {
       int n;
       System.out.println("Enter the no. you want to print the table:");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for(int i=1;i<=10;i++)
       {
        System.out.println(n+"X"+i+"="+n*i);
       }
     }
}
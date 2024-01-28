//factorial of a no.

import java.lang.*;
import java.util.Scanner;

class factorial
 {
   public static void main(String [] args)
     {
       int n;
       System.out.println("Enter the no. to find the factorial:");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       int fact =1;
       for(int i=1;i<=n;i++)
       {
         fact = fact*i;
       }
       System.out.println("Factorial of "+n+" is :"+fact);
       }
}
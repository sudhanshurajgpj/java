//finding roots of a quadratic equation

import java.lang.*;
import java.util.Scanner;

class quadratic
  {

     public static void main(String [] args)
       {

        int a,b,c;
        double r1,r2;
    System.out.println("Enter values of a,b and c:");
    Scanner kb = new Scanner(System.in);
    a = kb.nextInt();
    b = kb.nextInt();
    c = kb.nextInt();

  r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
  r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

 System.out.println("Roots are "+ r1 +" "+r2);
}
}
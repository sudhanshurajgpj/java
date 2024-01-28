import java.lang.*;
import java.util.Scanner;


class Expression
 {

    public static void main (String [] args)
   {

    int a,b,c;
    float s;
    double area;

    System.out.println("Enter all the three side of the traingle:");
    Scanner kb = new Scanner(System.in);

    a =  kb.nextInt();
    b =  kb.nextInt();
    c =  kb.nextInt();

    s = (a+b+c)/2f;
  
   area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
   System.out.println("The area is :" +area);
}
}
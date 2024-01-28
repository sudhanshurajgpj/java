// area of cuboid and volume 

import java.lang.*;
import java.util.Scanner;

class cuboid
{

  public static void main(String [] args)
    {
       
       int length,breadth,height;
       int totalArea,volume;

     System.out.println("Enter length, breadth & height:");
     Scanner kb = new Scanner(System.in);

     length = kb.nextInt();
     breadth = kb.nextInt();
     height = kb.nextInt();

   totalArea = 2*(length*breadth+length*height+breadth*height);
   volume = length*breadth*height;
   System.out.println("Total area is "+totalArea);
   System.out.println("Volume is "+volume);

     }
}
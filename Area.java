import java.lang.*;
import java.util.Scanner;


class Area
{
    public static void main (String [] args)
{
    float base,height,area;
    System.out.println("Enter base and height:");
    Scanner kb = new Scanner(System.in);
    base = kb.nextFloat();
    height = kb.nextFloat();
    area = (base*height)/2;

System.out.println("Area is :" +area);
}
}
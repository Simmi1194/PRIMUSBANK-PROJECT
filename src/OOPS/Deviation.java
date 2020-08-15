package OOPS;
import java.util.*;

public class Deviation {
public static void main (String[]args)
{
    Scanner in = new Scanner(System.in);

    double dm = 10.0;  
    double n1 = 0.0;    
    double n2 = 0.0;    
    System.out.println("Enter Two numbers: ");
    for (int i=0; i < 10; i++) {
      double n = in.nextDouble();
      n1 += n;
      n2 += n * n;
    }
    
    double variance = (dm * n2 - n1 * n1) / (dm * dm);
    double sd = Math.sqrt(variance);

   
    System.out.println("The standard deviation of numbers is : " + sd);
}
}
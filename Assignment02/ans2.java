package Assignment02;
import java.util.*;
public class ans2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      double meter,feet,inch,centimeter;
      System.out.println("enter the distance in km");
      double killo = sc.nextDouble();
      meter = killo*1000;
      feet = killo*3280.8399;
      inch = killo*39370.0787;
      centimeter = killo*100000;
      System.out.println( killo+" km is" +meter+ " meters");  
      System.out.println( killo+" km is" +feet+ " feet"); 
         System.out.println( killo+" km is" +inch+ " inch");
         System.out.println( killo+" km is" +centimeter+ " centimeter");   

    }
}

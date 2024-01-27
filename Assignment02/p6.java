package Assignment02;
import java.util.*;
public class p6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    float d;
    double g = 32.174f;
    System.out.println(" ener the time");
    float t = sc.nextFloat();
    d = (float) ((0.5)*g*(t*t));
    System.out.println(d);
  }  
}

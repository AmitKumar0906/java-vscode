package Assignment02;
import java.util.*;
public class ans5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double r, surface ,volume;
        System.out.println(" enter the radius of hemisphere");
        r= sc.nextDouble();
         surface  = 3 * Math.PI*r*r;
        System.out.println( surface);
        volume = (0.66)*Math.PI*(r*r*r);
        System.out.println(volume);

    }
}

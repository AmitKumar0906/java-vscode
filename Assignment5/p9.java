package Assignment5;
import java.util.*;
public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        double n = sc.nextDouble();
        double temp=0;
        for( double i=1;i<=n;i++){
            double a=(double)(Math.pow(i,2));
            temp  = temp+(1/(a));
        }
        System.out.println(temp);

    }
}

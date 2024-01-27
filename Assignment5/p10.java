package Assignment5;
import java.util.*;
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        double n = sc.nextDouble();
        int a=0,b=1,c=1,d=0;
        System.out.println(a+" "+b+" "+c+" ");
        for(int i=1;i<=n;i++)
        {

        
        d=a+b+c;
        a=b;
        b=c;
        c=d;
        System.out.println(d+" ");
    }
}
}

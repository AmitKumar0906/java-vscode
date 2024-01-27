package Assignment5;
import java.util.*;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        int sum1 = 0;
        for( int i=1;i<=n;i++){
            int sum = 0;
            for( int j=1;j<=i;j++){
                sum+=j;
            }sum1+=sum;
            //System.out.println(sum);
        }
        System.out.println(sum1);  
    }
}

package Assignment5;
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter the first number ");
        int a = sc.nextInt();
        System.out.println(" enter the second  number ");
        int b = sc.nextInt();
        for ( int i = 0;i<=b;i++){
            int counter = 0;
            for( int j = 1;j<=i;j++){
                if ( i%j==0){
                    counter ++;
                }
            }
            if ( counter ==2){
                System.out.println(i+" ");
            }
        }
    }
}

package Assignment04;
import java.util.*;
public class ha04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,product=1;
        System.out.println(" enter the number");
        int N=sc.nextInt();
        
        for(int j=1;j<=N;j++)
        {
            
            if(j%2==0){
                sum+=j;
            }else{
                product*=j;
            }
        }System.out.println("sum of all even number is" +sum);
        System.out.println("product of all odd number is" +product);
    }
}

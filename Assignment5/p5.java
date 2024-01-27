package Assignment5;

public class p5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 15;
        for( int i =a;i<=b;i++){
            System.out.println(" multiplication table  of " +i+" is");
            for ( int j=1;j<=10;j++){
                System.out.println(i + "*"+j+"="+i*j);
            }
        }
    }
}

public class hollowrectangle {
    public static void hollow_rectangle(int totRows,int totCols) {
        //outerloop
        for(int i = 1;i<=totRows;i++){
            //inner loop
            for(int j = 1;j<=totCols;j++){
                //cell-(i,j)
                if( i==1||i==totRows||j==1||j==totCols){
                    System.out.print ("*");
                }
                else{
                    System.out.print( " ");
                }

            }
            System.out.println();
        }
    }
    public static void invertedstar(int n) {
        for( int i = 1;i<=n;i++){
            for( int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for( int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void inverted_half_pyramid_with_number( int n) {
        for ( int i = 1;i<=n;i++){
            for( int j = 1;j<=n-i+1;j++){
                System.out.print(j+" " );
        }
        System.out.println();
    }
    }
    public static void floyd_triangle ( int n){
        int l =1;
        for( int i = 1;i<=n;i++){
            for ( int j=1;j<=i;j++){
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
        }
    }
        
    
    public static void main(String[] args) {
        //hollow_rectangle(4, 5);
       //invertedstar(4);
       //inverted_half_pyramid_with_number(5);
       floyd_triangle(6);
    }
}

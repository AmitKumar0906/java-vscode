public record Ans9() {
    public static void main(String[]args){
        int n = 9;
       // int line =0;
        for(int line=1; line<=n; line++){
            for (int star=1; star<=(n-line+1); star++){
                System.out.print("*");

            }
            System.out.println();
        }
    


    }
    
}

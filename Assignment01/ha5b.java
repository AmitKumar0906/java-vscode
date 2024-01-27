package Assignment01;

public class ha5b {
    public static void main(String[] args) {
        int W = 5, G = 10, K = 15, A = 20;

        // Exchange values without extra variables
        W = W + G;
        G = W - G;
        W = W - G;

        A = A + K;
        K = A - K;
        A = A - K;

        System.out.println("Values after exchange without extra variables:");
        System.out.println("W: " + W);
        System.out.println("G: " + G);
        System.out.println("K: " + K);
        System.out.println("A: " + A);
    }
}

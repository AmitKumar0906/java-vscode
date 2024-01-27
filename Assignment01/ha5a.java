package Assignment01;

public class ha5a {
    public static void main(String[] args) {
        int w = 10,g = 20, k= 30, A =40;
		int temp1 =w;
		int temp2 =A;
		int temp3 = k;
		
		w = A;
		A = k;
		k = g;
		g = temp1;
		
		System.out.println("w: +"  +w);
		System.out.println("g: +"  +g);
		System.out.println("k: +"  +k);
		System.out.println("A: +"  +A);
    }
}

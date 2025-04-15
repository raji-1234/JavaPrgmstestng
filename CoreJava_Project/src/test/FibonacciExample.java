package test;

public class FibonacciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int i = 0;
		System.out.print(a + " ");
		System.out.print(b + " ");
		while (i < 8) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			i++;
		}
	}

}

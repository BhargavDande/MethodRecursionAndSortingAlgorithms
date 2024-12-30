import java.util.Scanner;

public class P17PrintNthFibonacciSeriesByMethodRecursion {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter first series : ");
		int a = ip.nextInt();
		System.out.println("Enter second series : ");
		int b = ip.nextInt();
		System.out.println("Enter Nth series value : ");
		int n = ip.nextInt();
		nTHfibonacci(a, b, n);
	}

	public static void nTHfibonacci(int a, int b, int n) {
		if (n == 1) {
			System.out.println(a);
			return;
		}
		int c = a + b;
		a = b;
		b = c;
		nTHfibonacci(a, b, --n);
	}
}

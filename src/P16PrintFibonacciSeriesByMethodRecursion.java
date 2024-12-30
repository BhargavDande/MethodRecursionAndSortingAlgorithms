import java.util.Scanner;

public class P16PrintFibonacciSeriesByMethodRecursion {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter first series : ");
		int a = ip.nextInt();
		System.out.println("Enter second series : ");
		int b = ip.nextInt();
		System.out.println("Enter series to print : ");
		int s = ip.nextInt();
		fibonacci(a, b, s);
	}

	public static void fibonacci(int a, int b, int s) {
		if (s == 0) {
			return;
		}
		System.out.print(a + " ");
		int c = a + b;
		a = b;
		b = c;
		fibonacci(a, b, --s);
	}
}

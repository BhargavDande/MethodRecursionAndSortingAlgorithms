import java.util.Scanner;

public class P12FactorialOfGivenNumberByMethodRecursion {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		fact(n, 1);
	}

	public static void fact(int n, int fact) {
		if (n == 1) {
			System.out.println("Factorial : " + fact);
			return;
		}
		fact = fact * n;
		n = n - 1;
		fact(n, fact);
	}
}

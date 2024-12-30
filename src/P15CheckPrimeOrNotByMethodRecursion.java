import java.util.Scanner;

public class P15CheckPrimeOrNotByMethodRecursion {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		prime(ip.nextInt(), 1, 0);
	}

	public static void prime(int n, int i, int c) {
		if (i > n) {
			System.out.println(c == 2 ? "Prime" : "Not a Prime");
			return;
		}
		c = n % i == 0 ? c + 1 : c;
		i = i + 1;
		prime(n, i, c);
	}
}

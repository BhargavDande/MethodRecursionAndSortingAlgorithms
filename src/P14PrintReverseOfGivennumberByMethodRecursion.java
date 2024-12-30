import java.util.Scanner;

public class P14PrintReverseOfGivennumberByMethodRecursion {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		reverse(ip.nextInt(), 0);
	}

	public static void reverse(int n, int rev) {
		if (n == 0) {
			System.out.println("reverse : " + rev);
			return;
		}
		rev = rev * 10 + (n % 10);
		n = n / 10;
		reverse(n, rev);
	}
}

import java.util.Scanner;

public class P11CountDigitsInGivenNumberByMethodRecursion {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		cd(n, 0);
	}

	public static void cd(int n, int c) {
		if (n == 0) {
			System.out.println("Count of Digits : " + c);
			return;
		}
		c = c + 1;
		n = n / 10;
		cd(n, c);
	}
}

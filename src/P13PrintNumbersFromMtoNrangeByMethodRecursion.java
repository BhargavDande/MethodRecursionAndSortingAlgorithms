import java.util.Scanner;

public class P13PrintNumbersFromMtoNrangeByMethodRecursion {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = ip.nextInt();
		System.out.println("Enter n value : ");
		int n = ip.nextInt();
		range(m, n);
	}

	public static void range(int m, int n) {
		if (m > n) {
			return;
		}
		System.out.print(m + " ");
		range(m + 1, n);
	}
}

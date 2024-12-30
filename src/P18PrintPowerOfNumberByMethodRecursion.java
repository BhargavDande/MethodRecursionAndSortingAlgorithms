import java.util.Scanner;

public class P18PrintPowerOfNumberByMethodRecursion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter base value : ");
		int base = s.nextInt();
		System.out.println("Enter exponent value : ");
		int exp = s.nextInt();
		powOfNum(base, exp, 1);
	}

	public static void powOfNum(int base, int exp, int prod) {
		if (exp == 0) {
			System.out.println(prod);
			return;
		}
		prod = prod * base;
		powOfNum(base, exp - 1, prod);
	}
}

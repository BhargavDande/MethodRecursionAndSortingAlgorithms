import java.util.Arrays;
import java.util.Scanner;

public class P26PrintSumOfSubArrayElementsEqualToTarget {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter target value : ");
		int t = ip.nextInt();
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + a[k];
				}
				if (sum == t) {
					int res[] = { i, j };
					System.out.println(Arrays.toString(res));
				}
			}
		}
	}
}

import java.util.Arrays;

public class P23InsertionSort {
	public static void main(String[] args) {
		int[] a = { 4, 3, 1, 5, -1, 7, -4, 9 };
		for (int i = 1; i < a.length; i++) {
			int t = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > t) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = t;
		}
		System.out.println(Arrays.toString(a));
	}
}

import java.util.Arrays;

public class P22SelectionSort {
	public static void main(String[] args) {
		int[] a = { 2, 26, -2, 5, 4, 9, -1, -7, 19 };
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) {
				int t = a[i];
				a[i] = a[min];
				a[min] = t;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}

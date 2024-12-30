import java.util.Arrays;

public class P24BubbleSort {
	public static void main(String[] args) {
		int[] a = { 23, 11, 36, 9, 18, -1, 99, 2 };
		System.out.println("Before sorting is : " + Arrays.toString(a));
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("After sorting is : " + Arrays.toString(a));
	}
}

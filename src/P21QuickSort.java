import java.util.Arrays;

public class P21QuickSort {
	public static void main(String[] args) {
		int[] a = { 1, 10, 4, 20, 5, -1, -19 };
		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	public static void quickSort(int[] a, int s, int e) {
		if (s >= e) {
			return;
		}
		int i = s, j = e;
		int piv = a[j];
		while (i < j) {
			while (a[i] < piv) {
				i++;
			}
			while (a[j] > piv) {
				j--;
			}
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		quickSort(a, s, j);
		quickSort(a, i, e);
	}
}

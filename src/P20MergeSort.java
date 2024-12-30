import java.util.Arrays;

public class P20MergeSort {
	public static void main(String[] args) {
		int[] a = { -1, -10, 5, 8, -9 };
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void mergeSort(int[] a) {
		if (a.length == 1) {
			return;
		}
		int[] left = new int[a.length / 2];
		int[] right = new int[a.length - a.length / 2];
		copyEle(a, 0, a.length / 2, left);
		copyEle(a, a.length / 2, a.length, right);
		mergeSort(left);
		mergeSort(right);
		merge(left, right, a);
	}

	public static void copyEle(int[] a, int s, int e, int arr[]) {
		int j = 0;
		for (int i = s; i < e; i++) {
			arr[j++] = a[i];
		}
	}

	public static void merge(int left[], int right[], int[] a) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				a[k++] = left[i++];
			} else {
				a[k++] = right[j++];
			}
		}
		while (i < left.length) {
			a[k++] = left[i++];
		}
		while (j < right.length) {
			a[k++] = right[j++];
		}
	}
}

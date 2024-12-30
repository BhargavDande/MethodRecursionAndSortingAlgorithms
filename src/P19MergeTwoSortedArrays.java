import java.util.Arrays;

public class P19MergeTwoSortedArrays {
	public static void main(String[] args) {
		int[] a = { 1, 10, 15, 17, 45 };
		int[] b = { -1, 6, 7, 15, 35 };
		int res[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				res[k++] = a[i++];
			} else {
				res[k++] = b[j++];
			}
		}
		while (i < a.length) {
			res[k++] = a[i++];
		}
		while (j < b.length) {
			res[k++] = b[j++];
		}
		System.out.println(Arrays.toString(res));
	}
}

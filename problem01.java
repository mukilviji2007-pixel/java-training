import java.util.Arrays;
public class Mergesort {
    public static void sort(int[] a, int s, int e) {
        if (s >= e) return;
        int m = s + (e - s) / 2;
        sort(a, s, m);
        sort(a, m + 1, e);
        merge(a, s, m, e);
    }
    private static void merge(int[] a, int s, int m, int e) {
        int[] t = new int[e - s + 1];
        int i = s, j = m + 1, k = 0;
        while (i <= m && j <= e) {
            t[k++] = (a[i] >= a[j]) ? a[i++] : a[j++];
        }
        while (i <= m) t[k++] = a[i++];
        while (j <= e) t[k++] = a[j++];
        System.arraycopy(t, 0, a, s, t.length);
    }
    public static void main(String[] args) {
        int[] numbers = {15, 3, 9, 21, 6, 12, 1};
        System.out.println("Before: " + Arrays.toString(numbers));
        sort(numbers, 0, numbers.length - 1);
        System.out.println("After:  " + Arrays.toString(numbers));
    }
}
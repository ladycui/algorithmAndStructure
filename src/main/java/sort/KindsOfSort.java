package sort;

import java.util.Arrays;

/**
 * @Auther: cyn
 * @Date: 2019-12-20 09:47
 * @Description:
 */
public class KindsOfSort {
    private int[] nums;
    private int len;

    private KindsOfSort() {
        nums = new int[]{2, 5, 9, 8, 4, 7, 3, 6};
        len = nums.length;
    }

    public static void main(String[] args) {
        final KindsOfSort kindsOfSort = new KindsOfSort();
//        kindsOfSort.insertSort();
        kindsOfSort.quickSort();
        Arrays.stream(kindsOfSort.nums).forEach(e -> System.out.println(e));
    }

    /**
     * O(n2)
     */
    private void insertSort() {
        for (int i = 1; i < len; i++) {
            int temp = nums[i];
            int j;
            for (j = i; j > 0 && nums[j - 1] > temp; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = temp;
        }
    }

    private void quickSort() {
        quickSort(0, len - 1);
    }

    private void quickSort(int begin, int end) {
        if (begin >= end) {
            return;
        }
        int pivot = begin;
        int i = begin;
        int j = end;
        while (i < j) {
            while (nums[i] < nums[pivot]) {
                i++;
            }
            while (nums[j] > nums[pivot]) {
                j--;
            }
            if (i != j) {
                swap(i, j);
            }
        }

        quickSort(begin, pivot - 1);
        quickSort(pivot + 1, end);
    }

    private void swap(int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

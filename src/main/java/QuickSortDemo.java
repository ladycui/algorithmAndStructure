/**
 * @Auther: cyn
 * @Date: 2019-10-08 16:35
 * @Description:
 */
public class QuickSortDemo {

    public static void main(String[] args) {
        int[] array = {2, 5, 3, 4, 6, 7};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void quickSort(int[] array, int begin, int end) {
        if (end - begin < 2) {
            return;
        }

        int pivot = array[begin];
        int i = begin + 1;
        int j = end;
        while (i < j) {
            while (array[i] < pivot && i < j)
                i++;
            while (array[j] >= pivot && i < j) {
                j--;
            }
            if (i == j) {
                break;
            }
            swap(array, i, j);
        }
        transferPivot(array, begin, i - 1);
        quickSort(array, begin, i - 1);
        quickSort(array, j, end);
    }

    private static void transferPivot(int[] array, int begin, int end) {
        int pivot = array[begin];
        for (int i = begin + 1; i < end; i++) {
            array[i - 1] = array[i];
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static int[] quickSort2(int[] array, int begin, int end) {
        if (array.length < 2) {
            return array;
        }





        return null;
    }


}

/**
 * @Auther: cyn
 * @Date: 2019-09-26 15:07
 * @Description:
 */
public class RecurveArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(printSum(array));
        System.out.println(recurveSum(array));
    }

    public static int printSum(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }

    public static int recurveSum(int[] arr) {//todo: && vs &
        int len = arr.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return arr[0];
        }
        int s = len / 2;
        int[] left = new int[s];
        int[] right = new int[len - s];
        int i = 0;
        for (int ele : arr) {
            if (i < s) {
                left[i] = arr[i++];
            } else {
                right[len- 1 - i] = arr[i++];
            }
        }
        return recurveSum(left) + recurveSum(right);
    }
}

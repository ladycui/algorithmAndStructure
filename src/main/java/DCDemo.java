/**
 * @Auther: cyn
 * @Date: 2019-10-08 16:13
 * @Description: 递归求解： 输入一个长方体，求视其均分的最大正方形的大小
 */
public class DCDemo {
    public static void main(String[] args) {
        int m = 168;
        int n = 64;
        System.out.println(getMaxSquareByDC(m,n));

    }

    private static int getMaxSquareByDC(int m, int n) {
        if (m < n) {//m is the max
            int tmp = n;
            n = m;
            m = tmp;
        }
        if (m % n == 0) {
            return n;
        }
        return getMaxSquareByDC(m % n, n);
    }
}

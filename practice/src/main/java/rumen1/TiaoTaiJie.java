package rumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiaoTaiJie {
    /**
     * 描述 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     *
     * 数据范围：(1≤n≤40) 要求：时间复杂度：O(n)O(n) ，空间复杂度： O(1)O(1)
     *
     * 输入：2 返回值：2
     *
     * 输入：7 返回值：21
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int count = Integer.parseInt(s);
            if (count == 0 || count == 1) {
                System.out.println(count);
            }else{
                System.out.println(jump(count));
            }

        }
    }

    private static int jump(int count) {
        int[] ints = new int[count + 1];
        ints[0] = 1;
        ints[1] = 1;
        for (int i = 2; i <= count; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[count];
    }
}

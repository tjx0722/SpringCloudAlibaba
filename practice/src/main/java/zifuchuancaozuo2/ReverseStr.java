package zifuchuancaozuo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStr {
    /**
     * 将一个字符串str的内容颠倒过来，并输出。
     * 数据范围：1≤len(str)≤10000
     * 输入描述：
     * 输入一个字符串，可以有空格
     * 输出描述：
     * 输出逆序的字符串
     *
     * 示例1
     * 输入：I am a student
     * 输出：tneduts a ma I
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            char[] chars = str.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                System.out.print(chars[i]);
            }
        }

    }
}

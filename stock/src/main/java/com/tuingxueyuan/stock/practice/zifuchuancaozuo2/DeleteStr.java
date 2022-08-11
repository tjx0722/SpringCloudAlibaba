package com.tuingxueyuan.stock.practice.zifuchuancaozuo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DeleteStr {
    /**
     * 描述 实现删除字符串中出现次数最少的字符，若出现次数最少的字符有多个，则把出现次数最少的字符都删除。 输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
     * <p>
     * 数据范围：输入的字符串长度满足 1≤n≤20 ，保证输入的字符串中仅出现小写字母
     * <p>
     * 输入描述： 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
     * <p>
     * 输出描述： 删除字符串中出现次数最少的字符后的字符串。
     * <p>
     * 输入： aabcddd 输出： aaddd
     */
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = read.readLine()) != null) {
            int[] arr = appearNum(str);
            int tmp = Integer.MAX_VALUE;
            for (int appear : arr) {
                tmp = Math.min(appear, tmp);
            }
            List<Integer> tmpList = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == tmp) {
                    tmpList.add(i);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i : tmpList) {
                sb.append(str.charAt(i));
            }
            for (char c : sb.toString().toCharArray()) {
                str = str.replaceAll(String.valueOf(c), "");
            }
            System.out.println(str);

        }

    }

    public static int[] appearNum(String str) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}

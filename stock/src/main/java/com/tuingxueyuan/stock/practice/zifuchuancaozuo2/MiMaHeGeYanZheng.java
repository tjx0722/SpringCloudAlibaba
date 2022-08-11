package com.tuingxueyuan.stock.practice.zifuchuancaozuo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class MiMaHeGeYanZheng {
    /**
     * 描述 密码要求:
     *
     * 1.长度超过8位
     *
     * 2.包括大小写字母.数字.其它符号,以上四种至少三种
     *
     * 3.不能有长度大于2的包含公共元素的子串重复 （注：其他符号不含空格或换行）
     *
     * 数据范围：输入的字符串长度满足 1≤n≤100 输入描述： 一组字符串。
     *
     * 输出描述： 如果符合要求输出：OK，否则输出NG
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = reader.readLine()) != null) {
            if (input.length() <= 8 || input.length() > 100) {
                System.out.println("NG");
                continue;
            }
            if (isLegal(input)) {
                System.out.println("NG");
                continue;
            }
            if (isRepeat(input)) {
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
    }

    private static boolean isLegal(String input) {
        int count = 0;
        //
        Pattern p1 = Pattern.compile("[A-Z]");
        if (p1.matcher(input).find())
            count++;
        Pattern p2 = Pattern.compile("[a-z]");
        if (p2.matcher(input).find())
            count++;
        Pattern p3 = Pattern.compile("[0-9]");
        if (p3.matcher(input).find())
            count++;
        Pattern p4 = Pattern.compile("[^0-9A-Za-z]");
        if (p4.matcher(input).find())
            count++;
        if (count >= 3)
            return false;
        return true;
    }

    // 判断是否有长度为3以上的重复子串
    private static boolean isRepeat(String input){
        for (int i = 3; i < input.length(); i++) {
            if (input.substring(i).contains(input.substring(i - 3, i))) {
                return true;
            }
        }
        return false;
    }
}

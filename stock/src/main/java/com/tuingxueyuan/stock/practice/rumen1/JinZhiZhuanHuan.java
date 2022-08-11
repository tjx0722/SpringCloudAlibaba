package com.tuingxueyuan.stock.practice.rumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JinZhiZhuanHuan {
    /**
     * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
     * <p>
     * 输入描述：
     * 输入一个十六进制的数值字符串。
     * <p>
     * 输出描述：
     * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
     * <p>
     * 输入：
     * 0xAA
     * <p>
     * 输出：
     * 170
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            if (str.contains("x")) {
                String newStr = str.substring(str.indexOf('x') + 1);
                char[] chars = newStr.toCharArray();
                long sum = 0;
                for (int i = chars.length - 1; i >= 0; i--) {
                    sum += Math.pow(16, i) * transInt(chars[chars.length - i - 1]);
                }
                System.out.println(sum);
            }

        }
    }




        /*public static void main(String[] args) throws Exception{
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                System.out.println(Long.parseLong(s.substring(2),16));
            }
        }*/

    private static long transInt(char ch) {
        int tmp = 0;
        switch (ch) {
            case 'A':
                tmp = 10;
                break;
            case 'B':
                tmp = 11;
                break;
            case 'C':
                tmp = 12;
                break;
            case 'D':
                tmp = 13;
                break;
            case 'E':
                tmp = 14;
                break;
            case 'F':
                tmp = 15;
                break;
            default:
                tmp = Integer.parseInt(String.valueOf(ch));
        }
        return tmp;
    }
}
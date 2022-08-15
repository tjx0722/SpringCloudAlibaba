package zifuchuancaozuo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class IPChange {
    /**
     * 描述
     * 原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
     * 一个长整数。
     * 举例：一个ip地址为10.0.3.193
     * 每段数字             相对应的二进制数
     * 10                   00001010
     * 0                    00000000
     * 3                    00000011
     * 193                  11000001
     *
     * 组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。
     * 数据范围：保证输入的是合法的 IP 序列
     *
     * 输入描述：
     * 输入
     * 1 输入IP地址
     * 2 输入10进制型的IP地址
     *
     * 输出描述：
     * 输出
     * 1 输出转换成10进制的IP地址
     * 2 输出转换后的IP地址
     *
     * 输入：
     * 10.0.3.193
     * 167969729
     *
     * 输出：
     * 167773121
     * 10.3.3.193
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null){
            if (str.contains(".")) {
                String result = "";
                String[] split = str.split("\\.");
                for (int i = 0; i < split.length; i++) {
                    result += tenToTwo(split[i]);
                }
                System.out.println(twoToTen(result));
            }else {
                String s = String.format("%032d",new BigInteger(tenToTwo1(str)));
                String result = "";
                for (int i = 0; i < s.length(); i+=8) {
                    if (i == s.length() - 8){
                        result += twoToTen(s.substring(i, i+8));
                    }else {
                        result += twoToTen(s.substring(i, i + 8)) + ".";
                    }
                }
                System.out.println(result);
            }

        }
    }

    // 十进制 -> 二进制
    private static String tenToTwo(String str){
        int num = Integer.parseInt(str);
        if (num == 0)
            return String.format("%08d", 0);
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num % 2);
            num = num / 2;
        }
        sb = sb.reverse();
        return String.format("%08d", Integer.parseInt(sb.toString()));
    }

    private static String tenToTwo1(String str){
        long num = Long.parseLong(str);
        if (num == 0)
            return String.format("%08d", 0);
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num % 2);
            num = num / 2;
        }
        return sb.reverse().toString();
    }

    // 二进制 -> 十进制
    private static long twoToTen(String str){
        return Long.parseLong(str, 2);
    }
}

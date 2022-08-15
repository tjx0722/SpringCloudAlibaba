package zifuchuancaozuo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubString {
    /**
     * 描述
     * 输入一个字符串和一个整数 k ，截取字符串的前k个字符并输出
     *
     * 数据范围：字符串长度满足 1≤n≤1000  ， 1≤k≤n
     * 输入描述：
     * 1.输入待截取的字符串
     *
     * 2.输入一个正整数k，代表截取的长度
     *
     * 输出描述：
     * 截取后的字符串
     *
     * 示例1
     * 输入：
     * abABCcDEF
     * 6
     *
     * 输出：
     * abABCc
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int count = 0;
        String word = "";
        int num = 0;
        while ((str = br.readLine()) != null) {
            count++;
            if (count % 2 == 1){
                word = str;
            }
            if (count % 2 == 0){
                num = Integer.parseInt(str);
                System.out.println(word.substring(0, num));
            }
        }
    }

    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            // 输入字符串和k
            String str = sc.next();
            int k = sc.nextInt();
            // 直接使用String的substring方法输出结果
            System.out.println(str.substring(0,k));
        }
    }*/
}
